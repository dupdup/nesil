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
import com.isurveysoft.www.servicesv5.Screen;
import com.isurveysoft.www.servicesv5.Survey;
import com.isurveysoft.www.servicesv5.SurveyResult;

public class Application extends Controller {
	private static Map<Long, Integer> chartQuestions = new HashMap<Long, Integer>();
	private static Map<Long, Integer> descQuestions = new HashMap<Long, Integer>();
	private static String user;
	private static String surveyPin;
	private static String surveyCP;
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
	public static Result ans() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults(surveyCP, surveyPin ,"2013-06-07 16:24:42","2013-06-08 23:24:42",0l);
		return ok(Json.toJson(results));
	}

	public static Result results() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		@SuppressWarnings("unchecked")
		List<QuestionJSON> cached = (List<QuestionJSON>) Cache.get(user);
		if(cached==null||cached.size()<1){
			Survey survey = service.getExportServiceSoap().exportSurvey(surveyCP, surveyPin);
			Screen[] screens= survey.getScreens();
			SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults(surveyCP, surveyPin ,"2013-06-07 16:24:42","2013-06-08 23:24:42",0l);
			cached = toJsonFormat(screens,results);
			Cache.set(user, cached);
		}
		return ok(Json.toJson(cached));
	}

	private static List<QuestionJSON> toJsonFormat(Screen[] screens, SurveyResult[] results) {
		List<QuestionJSON> list = new LinkedList<QuestionJSON>();
		HashMap<Tuple<Long, Long>, Integer> ansMap = new HashMap<Tuple<Long, Long>, Integer>();
		for(SurveyResult sr:results){
			for(com.isurveysoft.www.servicesv5.Result res : sr.getScreenResults()){
				Tuple<Long, Long> tuple = new Tuple<Long,Long>(res.getScreenId(),res.getAnswerId());
				Integer c = ansMap.get(tuple);
				if(c==null)
					ansMap.put(tuple, 1);
				else
					ansMap.put(tuple, c+1);
			}
		}
		for (Screen screen : screens) {
			//şimdilik sadece pie chartlar
			if(chartQuestions.containsKey(screen.getScreenId())){
				QuestionJSON que = new QuestionJSON();
				que.setText(screen.getScreenText());
				que.setType(chartQuestions.get(screen.getScreenId()));
				//que.setType("select".equals(screen.getType())?1:2);
				LinkedList<AnswerJSON> ansList = new LinkedList<AnswerJSON>();
				HashMap<Long, String> ansTextMap = new HashMap<Long, String>();
				for(Answer answer : screen.getAnswers()){
					ansTextMap.put(answer.getAnswerId(), answer.getAnswerText());
				}
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
		return survey();
	}
	public static Result getDistricts(int city,int townid) throws SQLException{
		Statement st = DB.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select id,name from district where townid ="+townid);
		List<AddressJSON> l = new LinkedList<AddressJSON>();
		while(rs.next()){
			l.add(new AddressJSON(rs.getString(2),rs.getInt(1)));
		}
		return ok();
	}
	public static Result getTowns(int city) throws SQLException{
		Statement st = DB.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select id,name from town where cityid ="+city);
		List<AddressJSON> l = new LinkedList<AddressJSON>();
		while(rs.next()){
			l.add(new AddressJSON(rs.getString(2),rs.getInt(1)));
		}
		return ok();
	}
	
}
