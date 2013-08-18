package controllers;

import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import play.mvc.Result;

import com.isurveysoft.www.servicesv5.Answer;
import com.isurveysoft.www.servicesv5.ExportService;
import com.isurveysoft.www.servicesv5.ExportServiceLocator;
import com.isurveysoft.www.servicesv5.Question;
import com.isurveysoft.www.servicesv5.Screen;
import com.isurveysoft.www.servicesv5.Survey;
import com.isurveysoft.www.servicesv5.SurveyResult;

public class Application extends Controller {
	private static final long GEOSCREENID = 0;
	private static Map<Long, Integer> chartQuestions = new HashMap<Long, Integer>();
	private static Map<Long, Integer> descQuestions = new HashMap<Long, Integer>();
	private static String user;
	private static String surveyPin;
	private static String surveyCP;
	private static long filterScreenId; 
	private static int surveyMainLocId;
	private static int surveyMainLocType;

	public static Result wsdl() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		Survey survey = service.getExportServiceSoap().exportSurvey(surveyCP, surveyPin);
		Screen[] screens= survey.getScreens();
		return ok(Json.toJson(screens));
	}
	public static Result survey(){
		return ok(views.html.index.render("doruk"));
	}	
	public static Result geores(){
		return ok(views.html.index2.render("doruk"));
	}	
	public static Result ans() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults(surveyCP, surveyPin ,"2013-07-27 16:24:42","2013-07-28 23:24:42",0l);
		return ok(Json.toJson(results));
	}

	public static Result results(int town,int district) throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		Screen[] cachedScreens =(Screen[]) Cache.get(user+"screen");
		if(cachedScreens==null||cachedScreens.length<1){
			Survey survey = service.getExportServiceSoap().exportSurvey(surveyCP, surveyPin);
			cachedScreens= survey.getScreens();
			Cache.set(user+"screen",cachedScreens);
		}
		SurveyResult[] cachedResults =(SurveyResult[]) Cache.get(user+"answer");
		if(cachedResults==null||cachedResults.length<1){
			cachedResults = service.getExportServiceSoap().exportSurveyResults(surveyCP, surveyPin ,"2013-07-27 16:24:42","2013-07-28 23:24:42",0l);
			Cache.set(user+"answer",cachedResults);
		}
		return ok(Json.toJson(toJsonFormat(cachedScreens,cachedResults,town,district)));
	}
	public static Result geoResults(long screenId) throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		@SuppressWarnings("unchecked")
		List<GeoAnswerJSON> cached = (List<GeoAnswerJSON>) Cache.get(user+"geo"+screenId);
		if(cached==null||cached.size()<1){
			SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults(surveyCP, surveyPin ,"2013-06-07 16:24:42","2013-06-08 23:24:42",0l);
			cached = toGeoJsonFormat(screenId ,results);
			Cache.set(user+"geo"+screenId, cached);
		}
		return ok(Json.toJson(cached));
	}

	private static List<QuestionJSON> toJsonFormat(Screen[] screens, SurveyResult[] results, int town, int district) {
		List<QuestionJSON> list = new LinkedList<QuestionJSON>();
		List<QuestionJSON> listMultiQue = new LinkedList<QuestionJSON>();
		HashMap<Tuple<Long, Long>, Integer> ansMap = new HashMap<Tuple<Long, Long>, Integer>();
		for(SurveyResult sr:results){
			//			LinkedList<com.isurveysoft.www.servicesv5.Result> l = new LinkedList<com.isurveysoft.www.servicesv5.Result>();
			boolean onRegion = true;
			if(town>0)
				for(com.isurveysoft.www.servicesv5.Result res : sr.getScreenResults()){
					if(res.getScreenId()==filterScreenId&&res.getResultAnswer()!=null&&res.getResultAnswer().length()>0){
						if(district>0){
							onRegion = district%10==res.getResultAnswer().codePointAt(0)%10;
						}
						else{
							onRegion = town%5 ==res.getResultAnswer().codePointAt(0)%5;
						}
					}
				}
			if(onRegion)
				for(com.isurveysoft.www.servicesv5.Result res : sr.getScreenResults()){
					Tuple<Long, Long> tuple = new Tuple<Long,Long>(res.getQuestionId()==null?res.getScreenId():res.getQuestionId(),res.getAnswerId());
					Integer c = ansMap.get(tuple);
					if(c==null)
						ansMap.put(tuple, 1);
					else
						ansMap.put(tuple, c+1);
				}
		}
		for (Screen screen : screens) {
			if(!chartQuestions.containsKey(screen.getScreenId())){
				continue;
			}
			HashMap<Long, String> ansTextMap = new HashMap<Long, String>();
			for(Answer answer : screen.getAnswers()){
				ansTextMap.put(answer.getAnswerId(), answer.getAnswerText());
			}
			if(screen.getQuestions()!=null && screen.getQuestions().length>0){
				for(Question q : screen.getQuestions()){
					QuestionJSON que = new QuestionJSON();
					que.setText(q.getQuestionText());
					que.setType(chartQuestions.get(screen.getScreenId()));
					List<AnswerJSON> ansList = new LinkedList<AnswerJSON>();	
					for(Long x : ansTextMap.keySet()){
						Tuple<Long, Long> key = new Tuple<Long,Long>(q.getQuestionId(),x);
						AnswerJSON ans = new AnswerJSON();
						ans.setCode(x);
						ans.setText(ansTextMap.get(x));
						Integer count = ansMap.get(key);
						ans.setCount(count==null?0:count);
						if(count!=null)
							ansList.add(ans);
					}
					que.setAnswer(ansList);
					listMultiQue.add(que);
				}
			}
			else{
				QuestionJSON que = new QuestionJSON();
				que.setText(screen.getScreenText());
				que.setType(chartQuestions.get(screen.getScreenId()));
				List<AnswerJSON> ansList = new LinkedList<AnswerJSON>();
				for(Long x : ansTextMap.keySet()){
					Tuple<Long, Long> key = new Tuple<Long,Long>(screen.getScreenId(),x);
					AnswerJSON ans = new AnswerJSON();
					ans.setCode(x);
					ans.setText(ansTextMap.get(x));
					Integer count = ansMap.get(key);
					ans.setCount(count==null?0:count);
					if(count!=null)
						ansList.add(ans);
				}
				que.setAnswer(ansList);
				list.add(que);
			}

		}
		list.addAll(listMultiQue);
		return list;
	}

	private static List<GeoAnswerJSON> toGeoJsonFormat(long screenId ,SurveyResult[] results) {
		List<GeoAnswerJSON> list = new LinkedList<GeoAnswerJSON>();
		for(SurveyResult sr:results){
			for(com.isurveysoft.www.servicesv5.Result res : sr.getScreenResults()){
				if(res.getScreenId()==screenId)
					list.add(new GeoAnswerJSON(sr.getResultLocationLatitude()+"",
							sr.getResultLocationLongitude()+"",sr.getResultLocationAltitude()+"",new AnswerJSON(res.getResultAnswer(),res.getAnswerId(),1)));
			}
		}
		return list;
	}
	public static Result nesil(String userId) throws SQLException {
		user=userId;
		Statement st = DB.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select s.pin,s.id,s.cp,s.locid,s.loctype from user u,survey s where s.usercode = u.code and u.code = '"+user+"'");
		rs.next();
		surveyPin = rs.getString(1);
		surveyCP = rs.getString(3);
		surveyMainLocId = rs.getInt(4);
		surveyMainLocType = rs.getInt(5);
		int surveyId = rs.getInt(2);
		st = DB.getConnection().createStatement();
		rs = st.executeQuery("select q.screenid,q.quetype,q.charttype from survey s, question q where q.surveyid = "+surveyId);
		while(rs.next()){
			if(rs.getInt(2)==2){
				chartQuestions.put(rs.getLong(1), rs.getInt(3));
			}else if(rs.getInt(2)==1){
				descQuestions.put(rs.getLong(1), rs.getInt(3));
			}
		}
		st = DB.getConnection().createStatement();
		rs = st.executeQuery("select q.screenid from survey s, question q where q.quetype = 5 and q.surveyid = "+surveyId);
		rs.next();
		filterScreenId = rs.getLong(1);
		return survey();
	}
	public static Result getDistricts(int townid) throws SQLException{
		Statement st = DB.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select id,name from district where townid ="+townid);
		List<AddressJSON> l = new LinkedList<AddressJSON>();
		while(rs.next()){
			l.add(new AddressJSON(rs.getString(2),rs.getInt(1)));
		}
		return ok(Json.toJson(l));
	}
	public static Result getTowns() throws SQLException{
		if(surveyMainLocType==2){
			Statement st = DB.getConnection().createStatement();
			ResultSet rs = st.executeQuery("select name from town where id ="+surveyMainLocId);
			rs.next();
			return ok(Json.toJson(new AddressJSON(rs.getString(1), surveyMainLocId)));
		}
		Statement st = DB.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select id,name from town where cityid ="+surveyMainLocId);
		List<AddressJSON> l = new LinkedList<AddressJSON>();
		while(rs.next()){
			l.add(new AddressJSON(rs.getString(2),rs.getInt(1)));
		}
		return ok(Json.toJson(l));
	}

}
