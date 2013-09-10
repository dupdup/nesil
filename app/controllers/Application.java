package controllers;

import java.io.IOException;
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
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.xml.rpc.ServiceException;

import model.AddressJSON;
import model.AnswerJSON;
import model.GeoAnswerJSON;
import model.QuestionJSON;
import model.Resultx;
import model.Screenx;

import org.joda.time.DateTime;

import play.cache.Cache;
import play.db.DB;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.isurveysoft.www.servicesv5.ExportService;
import com.isurveysoft.www.servicesv5.ExportServiceLocator;
import com.isurveysoft.www.servicesv5.Question;
import com.isurveysoft.www.servicesv5.Screen;
import com.isurveysoft.www.servicesv5.Survey;
import com.isurveysoft.www.servicesv5.SurveyResult;

public class Application extends Controller {
//	private static Map<Long, Integer> chartQuestions = new HashMap<Long, Integer>();
//	private static Map<Long, Integer> descQuestions = new HashMap<Long, Integer>();
	private static List<Integer> allDistricts = java.util.Collections.synchronizedList(new ArrayList<Integer>());
	private static Date fromDate;
	private static Date toDate;

	public static Result wsdl() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		Survey survey = service.getExportServiceSoap().exportSurvey(session("surveyCP"),session("surveyPin"));
		Screen[] screens = survey.getScreens();
		return ok(Json.toJson(screens));
	}
	public static Result qdb() throws ServiceException, SQLException, IOException {
		ExportService service = new ExportServiceLocator();
		Survey survey = service.getExportServiceSoap().exportSurvey(session("surveyCP"),
				session("surveyPin"));
		Screen[] screens = survey.getScreens();
		Statement st = DB.getConnection().createStatement();
		String sql="insert into xscreen values ";
		String sql1="";
		for (Screen s : screens) {
			String value =s.getScreenText().replaceAll("[’'()]", "").replaceAll("\n", "");
			
			if(s.getQuestions().length>0){
				for(Question q:s.getQuestions()){
					String qvalue = q.getQuestionText().replaceAll("[’'()]", "").replaceAll("\n", "");
					sql1+="("+q.getQuestionId()+",'"+qvalue+"'"+","+s.getScreenId()+"),";
				}
			}
			sql+="("+s.getScreenId()+","+s.getScreenIdNext()+",'"+value+"',"+("text".equals(s.getType())?2:1)+","+(s.isNextScreenIsLinked()?1:0)+",4),";
		}
		if(!sql1.isEmpty()){
			sql1="insert into xquestion values "+ sql1;
			st.executeUpdate(sql1.substring(0, sql1.length()-1));
		}
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
		SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults(session("surveyCP"), session("surveyPin"),fromDate.toString(), toDate.toString(), 0l);
		return ok(Json.toJson(results));
	}
	private static class Facebook implements Callable<SurveyResult[]>{
		private ExportService service;
		private DateTime dt;
		public Facebook(DateTime i,ExportService service) {
			this.service = service;
			this.dt = i;
		}
		@Override
		public SurveyResult[] call() throws Exception {
			System.out.println(dt.toString()+" ------ "+ dt.plusDays(1).toString());
			return service.getExportServiceSoap().exportSurveyResults(session("surveyCP"), session("surveyPin"),dt.toString(), dt.plusDays(1).toString(), 0l);
		}
	}
	public static Result adb() throws ServiceException, SQLException, IOException, InterruptedException, ExecutionException {
		final ExportService service = new ExportServiceLocator();
		ExecutorService executor = Executors.newFixedThreadPool(4);
		List<Future<SurveyResult[]>> list = new ArrayList<Future<SurveyResult[]>>();
		DateTime fdt = new DateTime(fromDate);	  
		System.out.println(fdt.isAfterNow());
		while (!fdt.isAfterNow()) {
		  fdt = fdt.plusDays(1);
	      Callable<SurveyResult[]> worker = new Facebook(fdt,service);
	      Future<SurveyResult[]> submit = executor.submit(worker);
	      list.add(submit);
	    }
	    executor.shutdown();
	    Statement st =DB.getConnection().createStatement();
		int c = 0;
	    for (Future<SurveyResult[]> future : list){
	    	SurveyResult[] results = future.get();
	    	System.out.println(results.length);
			List<String> extracted = extracted(results,st);
			for (String sql : extracted) {
				st.addBatch(sql);
				if(++c%2000 ==0)
					st.executeBatch();
			}
	    }
	    st.executeBatch();
	    st.close();
	    return ok("sd");
	}
	
	private static List<String> extracted(SurveyResult[] results, Statement a) throws SQLException,IOException {
		if(results==null||results.length<1)
			return new LinkedList<String>();
		Statement st = a;
		ResultSet rs = st.executeQuery("select filterScreenId from survey where id = "+ session("surveyId"));
		rs.next();
		long districtId = rs.getLong(1);
		List<String> l = new LinkedList<String>();
		for(SurveyResult result: results){
			String district = "";
			for(com.isurveysoft.www.servicesv5.Result screenResult: result.getScreenResults()){
				String answer = screenResult.getResultAnswer()==null?"":screenResult.getResultAnswer();
				if(screenResult.getScreenId() == districtId){
					district = answer.replaceAll("[\\D]", "").replaceFirst ("^0*", "");
				}
				l.add( "insert into xresult (resultid,date,attid,answerid,devicename,answertext,questionid,screenid) values ("+result.getResultId()+",'"+screenResult.getResponseDate()+"',"+result.getResultId()
					+","+screenResult.getAnswerId()+",'"+result.getResultDeviceName()+"','"+answer.replaceAll("[’'()]", "").replaceAll("\n", "")
					+"',"+screenResult.getQuestionId()+","+screenResult.getScreenId()+")");
			}
			l.add("insert into xattendant(attendantid,lat,lng,mahalle,age,gender,profession) values ("+result.getResultId()+",'"+String.valueOf(result.getResultLocationLatitude())+"','"+result.getResultLocationLongitude()+"','"
					+district+"',0,0,' ')");
		}		
		return l;
	}


	public static Result geoResults(long screenId) throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		@SuppressWarnings("unchecked")
		List<GeoAnswerJSON> cached = (List<GeoAnswerJSON>) Cache.get(session("user")+ "geo" + screenId);
		if (cached == null || cached.size() < 1) {
			SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults(session("surveyCP"), session("surveyPin"),fromDate.toString(), toDate.toString(), 0l);
			cached = toGeoJsonFormat(screenId, results);
			Cache.set(session("user") + "geo" + screenId, cached);
		}
		return ok(Json.toJson(cached));
	}
	public static Result resultsx(int town, int district) throws SQLException{
		return ok(Json.toJson(fromDB(town, district)));
	}
	private static List<QuestionJSON> fromDB(int town, int district) throws SQLException {
		List<QuestionJSON> list = new LinkedList<QuestionJSON>();
		Statement st = DB.getConnection().createStatement();
		String sql ="";
		if(district > 0){
			sql ="SELECT s.screentext,r.screenid,r.answerid,r.answertext, q.charttype,count(r.attid), r.questionid"+
				" FROM xresult r"+ 
				" INNER JOIN xscreen s on s.screenid = r.screenid"+
				" INNER JOIN question q on q.screenid=s.screenid"+
				" INNER JOIN xattendant a on a.attendantid=r.attid"+ 
				" and q.quetype=2 AND s.surveyid = "+session("surveyId")+" and a.mahalle="+district+
				" GROUP BY r.screenid,r.questionid,r.answerid";
		}else if(town == 0 && district == 0){
			sql ="SELECT s.screentext,r.screenid,r.answerid,r.answertext, q.charttype,count(r.attid), r.questionid"+
					" FROM xresult r"+ 
					" INNER JOIN xscreen s on s.screenid = r.screenid"+
					" INNER JOIN question q on q.screenid=s.screenid"+ 
					" and q.quetype=2 AND s.surveyid = "+session("surveyId")+
					" GROUP BY r.screenid,r.questionid,r.answerid";
		}else{
			System.out.println("handan"+town+" "+ district);
		}
		
		ResultSet rs = st.executeQuery(sql);
		int tempScreenId = 0;
		int index=0;
		int screenId= 0;
		while(rs.next()){
				screenId = rs.getInt(2);
			
				if(screenId != tempScreenId){
					List<AnswerJSON> alist = new LinkedList<AnswerJSON>();
					tempScreenId = screenId;
					QuestionJSON q = new QuestionJSON();
					q.setScreenId(rs.getInt(2));
					q.setText(rs.getString(1));
					q.setType(rs.getInt(5));
					AnswerJSON ans = new AnswerJSON();
					ans.setCode(rs.getInt(3));
					ans.setText(rs.getString(4).trim().length()<2?"Cevap Yok":rs.getString(4));
					ans.setCount(rs.getInt(6));
					alist.add(ans);
					q.setAnswer(alist);
					list.add(q);
					index = list.indexOf(q);
				}else{
					AnswerJSON ans = new AnswerJSON();
					ans.setCode(rs.getInt(3));
					ans.setText(rs.getString(4).trim().length()<2?"Cevap Yok":rs.getString(4));
					ans.setCount(rs.getInt(6));
					list.get(index).getAnswer().add(ans);
					tempScreenId = screenId;
				}
		}
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
				l.add(new AddressJSON(rs.getString(2), rs.getInt(1)));
		}
		//kayıtlı olmayan mahalle kodları
//		if(townid==Integer.parseInt(session("surveyUndefinedTownId")) && allDistricts !=null && allDistricts.size()>0){
//			List<Integer> unique = new ArrayList<Integer>();
//			for(int code:allDistricts){
//				if(!unique.contains(code)){
//					AddressJSON toAdd = new AddressJSON(String.valueOf(code), code);
//					if(!l.contains(toAdd))
//						l.add(toAdd);
//					unique.add(code);
//				}
//			}
//		}
		return ok(Json.toJson(l));
	}

	public static Result getTowns() throws SQLException {
		if (Integer.parseInt(session("surveyMainLocType")) == 2) {
			Statement st = DB.getConnection().createStatement();
			ResultSet rs = st.executeQuery("select name from town where id ="+ session("surveyMainLocId"));
			rs.next();
			LinkedList<AddressJSON> l = new LinkedList<AddressJSON>();
			l.add(new AddressJSON(rs.getString(1),Integer.getInteger(session("surveyMainLocId"))));
			return ok(Json.toJson(l));
		}
		Statement st = DB.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select id,name from town where cityid ="+ session("surveyMainLocId"));
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
			session("user", username);
			st = DB.getConnection().createStatement();
			rs = st.executeQuery("select s.pin,s.id,s.cp,s.locid,s.loctype,s.fromdate,s.todate,s.undefinedtownid from user u,survey s where s.usercode = u.code and u.code = '"+ session("user") + "'");
			rs.next();

			session("surveyPin",rs.getString(1));
			session("surveyCP", rs.getString(3));
			session("surveyMainLocId",rs.getInt(4)+"");
			session("surveyMainLocType",rs.getInt(5)+"");
			fromDate = rs.getDate(6);
			toDate = rs.getDate(7);
			session("surveyUndefinedTownId",""+ rs.getInt(8)); 
			session("surveyId" ,rs.getInt(2)+"");
			st = DB.getConnection().createStatement();
			rs = st.executeQuery("select q.screenid from survey s, question q where q.quetype = 5 and q.surveyId = "+ session("surveyId"));
			rs.next();
			session("filterScreenId", ""+rs.getLong(1));
			st = DB.getConnection().createStatement();
			String sql = "select d.code,t.id from district d, town t where d.townid=t.id and "+(Integer.parseInt(session("surveyMainLocType"))==2?"t.id =":"t.cityid =")+Integer.parseInt(session("surveyMainLocId"));
			rs = st.executeQuery(sql);
			Map<Integer,Integer> mahalleilce = new HashMap<Integer, Integer>();
			while (rs.next()) {
				mahalleilce.put(rs.getInt(1), rs.getInt(2));
			}
			Cache.set(session("user")+"mahalle", mahalleilce);
			return ok(views.html.index.render("doruk"));
		}
	}

}
