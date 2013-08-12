package controllers;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import model.AnswerJSON;
import model.Nesil;
import model.QuestionJSON;
import model.Tuple;
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
	public static Result wsdl() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		Survey survey = service.getExportServiceSoap().exportSurvey("01f3e767b", "88ff56b59f");
		Screen[] screens= survey.getScreens();
		return ok(Json.toJson(screens));
	}
	public static Result survey(){
		return ok(views.html.index.render("doruk"));
	}	
	public static Result ans() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults("01f3e767b", "88ff56b59f" ,"2013-06-08 16:24:42","2013-06-08 23:24:42",0l);
		
		return ok(Json.toJson(results));
		}
	
	public static Result index() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();

		Survey survey = service.getExportServiceSoap().exportSurvey("01f3e767b", "88ff56b59f");
		Screen[] screens= survey.getScreens();
		SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults("01f3e767b", "88ff56b59f" ,"2013-06-08 16:24:42","2013-06-08 23:24:42",0l);
		List<QuestionJSON> list = toJsonFormat(screens,results);
		return ok(Json.toJson(list));
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
			QuestionJSON que = new QuestionJSON();
			que.setText(screen.getScreenText());
			que.setType("select".equals(screen.getType())?1:2);
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
		return list;
	}
	public static Result nesil() {
		return ok(Json.toJson(new Nesil("ggg")));
	}

}
