package controllers;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import model.AnswerJSON;
import model.Nesil;
import model.QuestionJSON;
import model.Tuple;
import play.cache.Cache;
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
	/*
	 * 1- piechart
	 * 2- barchart*/
	private int[] types = new int[]{1,2};
	private static Map<Long, Integer> chartAdana = new HashMap<Long, Integer>();
	private static Map<Long, Integer> tanimAdana = new HashMap<Long, Integer>();
	
	static{
		//tanımlayıcı sorularda tip gereksinimi ilerde olabilir diye bu fieldi yarattik. Şimdilik hepsi 1 olacak.
		tanimAdana.put(416878l, 1);
		tanimAdana.put(416881l, 1);
		tanimAdana.put(416960l, 1);
		tanimAdana.put(416980l, 1);
		tanimAdana.put(416984l, 1);
		tanimAdana.put(416985l, 1);
		tanimAdana.put(416986l, 1);
		tanimAdana.put(416987l, 1);
		tanimAdana.put(416990l, 1);
		tanimAdana.put(416991l, 1);
		tanimAdana.put(416995l, 1);
		tanimAdana.put(416997l, 1);
		tanimAdana.put(416998l, 1);
		tanimAdana.put(416999l, 1);
		tanimAdana.put(417000l, 1);
		tanimAdana.put(417001l, 1);
		tanimAdana.put(417002l, 1);
		tanimAdana.put(417003l, 1); //bina ya da daire fotoğrafı
		tanimAdana.put(416780l, 1); //anketimiz tamamlanmıştır

		
		
		
		chartAdana.put(416902l, 1);
		chartAdana.put(416919l, 1);
		chartAdana.put(416949l, 1);
		chartAdana.put(416955l, 1);
		chartAdana.put(416965l, 1);
		chartAdana.put(416968l, 1);
		chartAdana.put(416969l, 1);
		chartAdana.put(416970l, 1);
		chartAdana.put(416972l, 1);
		chartAdana.put(416974l, 1);
		chartAdana.put(416978l, 1);
		chartAdana.put(416981l, 1);
		chartAdana.put(416988l, 1);
		chartAdana.put(416989l, 1);
		chartAdana.put(416993l, 1);
		
		chartAdana.put(416920l, 2);
		chartAdana.put(416943l, 2);
		chartAdana.put(416908l, 2);
		chartAdana.put(416911l, 2);
		chartAdana.put(416952l, 2);
		chartAdana.put(416963l, 2);
		chartAdana.put(416966l, 2);
		chartAdana.put(416992l, 2);
		chartAdana.put(416994l, 2);
		
	}
	
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
		SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults("01f3e767b", "88ff56b59f" ,"2013-06-07 16:24:42","2013-06-08 23:24:42",0l);
		
		return ok(Json.toJson(results));
		}
	
	public static Result index() throws RemoteException, ServiceException {
		ExportService service = new ExportServiceLocator();
		List<QuestionJSON> cached = (List<QuestionJSON>) Cache.get("manisa");
		if(cached==null||cached.size()<1){
			Survey survey = service.getExportServiceSoap().exportSurvey("01f3e767b", "88ff56b59f");
			Screen[] screens= survey.getScreens();
			SurveyResult[] results = service.getExportServiceSoap().exportSurveyResults("01f3e767b", "88ff56b59f" ,"2013-06-07 16:24:42","2013-06-08 23:24:42",0l);
			cached = toJsonFormat(screens,results);
			Cache.set("manisa", cached);
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
			if(chartAdana.containsKey(screen.getScreenId())){
			QuestionJSON que = new QuestionJSON();
			que.setText(screen.getScreenText());
			que.setType(chartAdana.get(screen.getScreenId()));
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
	public static Result nesil() {
		return ok(Json.toJson(new Nesil("ggg")));
	}

}
