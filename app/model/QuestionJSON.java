package model;

import java.util.List;

public class QuestionJSON {
	private String text;
	private int type;
	private List<AnswerJSON> answer;
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<AnswerJSON> getAnswer() {
		return answer;
	}
	public void setAnswer(List<AnswerJSON> answer) {
		this.answer = answer;
	} 


}
