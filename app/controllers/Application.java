package controllers;

import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import model.AddressJSON;
import model.AnswerJSON;
import model.GeoAnswerJSON;
import model.QuestionJSON;
import model.Tuple;
import play.cache.Cache;
import play.db.DB;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http.Response;
import play.mvc.Result;

import com.isurveysoft.www.servicesv5.Answer;
import com.isurveysoft.www.servicesv5.ExportService;
import com.isurveysoft.www.servicesv5.ExportServiceLocator;
import com.isurveysoft.www.servicesv5.Question;
import com.isurveysoft.www.servicesv5.Screen;
import com.isurveysoft.www.servicesv5.Survey;
import com.isurveysoft.www.servicesv5.SurveyResult;

public class Application extends Controller {
	private static Map<Long, Integer> chartQuestions = new HashMap<Long, Integer>();
	private static Map<Long, Integer> descQuestions = new HashMap<Long, Integer>();
	private static Map<Integer,Integer> mahalleilce = new HashMap<Integer, Integer>();
	private static List<Integer> allDistricts = java.util.Collections.synchronizedList(new ArrayList<Integer>());
	private static String user;
	private static String surveyPin;
	private static String surveyCP;
	private static long filterScreenId;
	private static int surveyMainLocId;
	private static int surveyUndefinedTownId;
	private static int surveyMainLocType;
	private static Date fromDate;
	private static Date toDate;

	public static Result wsdl() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		Survey survey = service.getExportServiceSoap().exportSurvey(surveyCP,
				surveyPin);
		Screen[] screens = survey.getScreens();
		return ok(Json.toJson(screens));
	}
	public static Result qdb() throws RemoteException, ServiceException, SQLException, UnsupportedEncodingException {
		ExportService service = new ExportServiceLocator();
		Survey survey = service.getExportServiceSoap().exportSurvey(surveyCP,
				surveyPin);
		Screen[] screens = survey.getScreens();
		Statement st = DB.getConnection().createStatement();
		String sql="insert into xscreen values";
		for (Screen s : screens) {
			byte ptext[] = s.getScreenText().replaceAll("'"," ").getBytes("UTF-8");
			String value = s.getScreenText().replaceAll("'"," ");//new String(ptext, "UTF-8");
			sql+="("+s.getScreenId()+","+s.getScreenIdNext()+",'"+value+"',"+("text".equals(s.getType())?2:1)+","+(s.isNextScreenIsLinked()?1:0)+",5),";
		}
		System.out.println(sql.substring(0, sql.length()-1));
		st.executeUpdate(sql.substring(0, sql.length()-1));
		
		return ok(Json.toJson(screens));
	}

	public static Result survey() {
		return ok(views.html.index.render("doruk"));
	}

	public static Result geores() {
		return ok(views.html.index2.render("doruk"));
	}

	public static Result ans() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults(surveyCP, surveyPin,fromDate.toString(), toDate.toString(), 0l);
		return ok(Json.toJson(results));
	}

	public static Result results(int town, int district)
			throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		Screen[] cachedScreens = (Screen[]) Cache.get(user + "screen");
		if (cachedScreens == null || cachedScreens.length < 1) {
			Survey survey = service.getExportServiceSoap().exportSurvey(surveyCP, surveyPin);
			cachedScreens = survey.getScreens();
			Cache.set(user + "screen", cachedScreens);
		}
		SurveyResult[] cachedResults = (SurveyResult[]) Cache.get(user+ "answer");
		if (cachedResults == null || cachedResults.length < 1) {
			cachedResults = service.getExportServiceSoap().exportSurveyResults(surveyCP, surveyPin,fromDate.toString(), toDate.toString(), 0l);
//			cachedResults = service.getExportServiceSoap().exportSurveyResults(surveyCP, surveyPin, "2013-08-22 15:11:42","2013-09-20 00:11:42", 0l);
			Cache.set(user + "answer", cachedResults);
		}
		return ok(Json.toJson(toJsonFormat(cachedScreens, cachedResults, town,
				district)));
	}
	public static Result clearCache(){
		Cache.remove(user+"screen");
		Cache.remove(user+"answer");
		return ok("");
	}
	public static Result geoResults(long screenId) throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		@SuppressWarnings("unchecked")
		List<GeoAnswerJSON> cached = (List<GeoAnswerJSON>) Cache.get(user+ "geo" + screenId);
		if (cached == null || cached.size() < 1) {
			SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults(surveyCP, surveyPin,fromDate.toString(), toDate.toString(), 0l);
			cached = toGeoJsonFormat(screenId, results);
			Cache.set(user + "geo" + screenId, cached);
		}
		return ok(Json.toJson(cached));
	}

	private static List<QuestionJSON> toJsonFormat(Screen[] screens,SurveyResult[] results, int town, int district) {
		List<QuestionJSON> list = new LinkedList<QuestionJSON>();
		List<QuestionJSON> listMultiQue = new LinkedList<QuestionJSON>();
		HashMap<Tuple<Long, Long>, Integer> ansMap = new HashMap<Tuple<Long, Long>, Integer>();
		for (SurveyResult sr : results) {
			boolean onRegion = true;
			if (town > 0)
				for (com.isurveysoft.www.servicesv5.Result res : sr.getScreenResults()) {
					if (res.getScreenId() == filterScreenId&& res.getResultAnswer() != null&& res.getResultAnswer().length() > 0) {
						String clearedFromChars = res.getResultAnswer().replaceAll("[\\D]", "").replaceFirst ("^0*", "");
						if(clearedFromChars.length()==0||clearedFromChars.length()>3){
							onRegion=false;
							break;
						}
						allDistricts.add(Integer.parseInt(clearedFromChars));
						if (district > 0) {
							onRegion = district==Integer.parseInt(clearedFromChars);
						} else if(surveyMainLocType!=2){
							Integer townofdistrict = mahalleilce.get(Integer.parseInt(clearedFromChars));
							onRegion = town == (townofdistrict==null?surveyUndefinedTownId:townofdistrict);
						}
					}
				}
			if (onRegion)
				for (com.isurveysoft.www.servicesv5.Result res : sr.getScreenResults()) {
					Tuple<Long, Long> tuple = new Tuple<Long, Long>(res.getQuestionId() == null ? res.getScreenId(): res.getQuestionId(), res.getAnswerId());
					Integer c = ansMap.get(tuple);
					if (c == null)
						ansMap.put(tuple, 1);
					else
						ansMap.put(tuple, c + 1);
				}
		}
		for (Screen screen : screens) {
			if (!chartQuestions.containsKey(screen.getScreenId())) {
				continue;
			}
			HashMap<Long, String> ansTextMap = new HashMap<Long, String>();
			for (Answer answer : screen.getAnswers()) {
				ansTextMap.put(answer.getAnswerId(), answer.getAnswerText());
			}
			if (screen.getQuestions() != null
					&& screen.getQuestions().length > 0) {
				for (Question q : screen.getQuestions()) {
					QuestionJSON que = new QuestionJSON();
					que.setScreenId(screen.getScreenId());
					que.setText(q.getQuestionText());
					que.setType(3);
					List<AnswerJSON> ansList = new LinkedList<AnswerJSON>();	
					for(Long x : ansTextMap.keySet()){
						Tuple<Long, Long> key = new Tuple<Long,Long>(q.getQuestionId(),x);
						AnswerJSON ans = new AnswerJSON();
						ans.setCode(x);
						ans.setText(ansTextMap.get(x));
						Integer count = ansMap.get(key);
						ans.setCount(count == null ? 0 : count);
						if (count != null)
							ansList.add(ans);
					}
					que.setAnswer(ansList);
					listMultiQue.add(que);
				}
			} else {
				QuestionJSON que = new QuestionJSON();
				que.setText(screen.getScreenText());
				que.setScreenId(screen.getScreenId());
				que.setType(chartQuestions.get(screen.getScreenId()));
				List<AnswerJSON> ansList = new LinkedList<AnswerJSON>();
				for (Long x : ansTextMap.keySet()) {
					Tuple<Long, Long> key = new Tuple<Long, Long>(screen.getScreenId(), x);
					AnswerJSON ans = new AnswerJSON();
					ans.setCode(x);
					ans.setText(ansTextMap.get(x));
					Integer count = ansMap.get(key);
					ans.setCount(count == null ? 0 : count);
					if (count != null)
						ansList.add(ans);
				}
				que.setAnswer(ansList);
				list.add(que);
			}

		}
		list.addAll(listMultiQue);
		return list;
	}

	private static List<GeoAnswerJSON> toGeoJsonFormat(long screenId,SurveyResult[] results) {
		List<GeoAnswerJSON> list = new LinkedList<GeoAnswerJSON>();
		for(SurveyResult sr:results){
			for(com.isurveysoft.www.servicesv5.Result res : sr.getScreenResults()){
				if(res.getScreenId()==screenId&&res.getAnswerId()!=null&&sr.getResultLocationLatitude()!=0&&sr.getResultLocationLongitude()!=0){
					list.add(new GeoAnswerJSON(sr.getResultLocationLatitude()+"",
							sr.getResultLocationLongitude()+"",sr.getResultLocationAltitude()+"",new AnswerJSON(res.getResultAnswer(),res.getAnswerId(),1)));
				}
			}
		}
		return list;
	}

	public static Result nesil(String userId) throws SQLException {

		return survey();
	}

	public static Result getDistricts(int townid) throws SQLException {
		Statement st = DB.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select code,name from district where townid ="+ townid);
		List<AddressJSON> l = new LinkedList<AddressJSON>();
		while (rs.next()) {
			if(allDistricts !=null && allDistricts.contains(rs.getInt(1))){
				l.add(new AddressJSON(rs.getString(2), rs.getInt(1)));
			}
		}
		//kayıtlı olmayan mahalle kodları
		if(townid==surveyUndefinedTownId && allDistricts !=null && allDistricts.size()>0){
			List<Integer> unique = new ArrayList<Integer>();
			for(int code:allDistricts){
				if(!unique.contains(code)){
					AddressJSON toAdd = new AddressJSON(String.valueOf(code), code);
					if(!l.contains(toAdd))
						l.add(toAdd);
					unique.add(code);
				}
			}
		}
		return ok(Json.toJson(l));
	}

	public static Result getTowns() throws SQLException {
		if (surveyMainLocType == 2) {
			Statement st = DB.getConnection().createStatement();
			ResultSet rs = st.executeQuery("select name from town where id ="+ surveyMainLocId);
			rs.next();
			LinkedList<AddressJSON> l = new LinkedList<AddressJSON>();
			l.add(new AddressJSON(rs.getString(1),surveyMainLocId));
			return ok(Json.toJson(l));
		}
		Statement st = DB.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select id,name from town where cityid ="+ surveyMainLocId);
		List<AddressJSON> l = new LinkedList<AddressJSON>();
		while (rs.next()) {
			l.add(new AddressJSON(rs.getString(2), rs.getInt(1)));
		}
		return ok(Json.toJson(l));
	}

	public static Result verify(String username, String password)throws SQLException {
		Statement st = DB.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select * from user where code ='"+ username + "' and name='" + password + "'");
		if (rs == null || rs.next() == false) {
			return ok(Json.toJson("{ \"result\":\"false\"} "));
		} else {
			user = username;
			st = DB.getConnection().createStatement();
			rs = st.executeQuery("select s.pin,s.id,s.cp,s.locid,s.loctype,s.fromdate,s.todate,s.undefinedtownid from user u,survey s where s.usercode = u.code and u.code = '"+ user + "'");
			rs.next();
			
			surveyPin = rs.getString(1);
			surveyCP = rs.getString(3);
			surveyMainLocId = rs.getInt(4);
			surveyMainLocType = rs.getInt(5);
			fromDate = rs.getDate(6);
			toDate = rs.getDate(7);
			surveyUndefinedTownId = rs.getInt(8); 
			int surveyId = rs.getInt(2);
			st = DB.getConnection().createStatement();
			rs = st.executeQuery("select q.screenid,q.quetype,q.charttype from survey s, question q where q.surveyid = "+ surveyId);
			while (rs.next()) {
				if (rs.getInt(2) == 2) {
					chartQuestions.put(rs.getLong(1), rs.getInt(3));
				} else if (rs.getInt(2) == 1) {
					descQuestions.put(rs.getLong(1), rs.getInt(3));
				}
			}
			st = DB.getConnection().createStatement();
			rs = st.executeQuery("select q.screenid from survey s, question q where q.quetype = 5 and q.surveyid = "+ surveyId);
			rs.next();
			filterScreenId = rs.getLong(1);
			st = DB.getConnection().createStatement();
			String sql = "select d.code,t.id from district d, town t where d.townid=t.id and "+(surveyMainLocType==2?"t.id =":"t.cityid =")+surveyMainLocId;
			rs = st.executeQuery(sql);
			while (rs.next()) {
					mahalleilce.put(rs.getInt(1), rs.getInt(2));
			}
//		    response().setHeader("Access-Control-Allow-Origin", "*");       // Need to add the correct domain in here!!
//		    response().setHeader("Access-Control-Allow-Methods", "GET");   // Only allow POST
//		    response().setHeader("Access-Control-Max-Age", "300");          // Cache response for 5 minutes
//		    response().setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");         // Ensure this header is also allowed!  
			return ok("true");
			//return ok(views.html.index.render("doruk"));
		}
	}

}
