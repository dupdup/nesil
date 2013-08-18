package model;


public class GeoAnswerJSON {

	private String lat;
	private String lng;
	private String att;
	private AnswerJSON answer; 
	
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getAtt() {
		return att;
	}
	public void setAtt(String att) {
		this.att = att;
	}
	public GeoAnswerJSON(String lat, String lng, String att, AnswerJSON answer) {
		super();
		this.lat = lat;
		this.lng = lng;
		this.att = att;
		this.answer = answer;
	}
	public AnswerJSON getAnswer() {
		return answer;
	}
	public void setAnswer(AnswerJSON answer) {
		this.answer = answer;
	}
	
}
