package model;

public class Resultx {
	
private long id;
private String text;
private long screenId;
private int type;
private String screenText;
private long questionId;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public long getScreenId() {
	return screenId;
}
public void setScreenId(long screenid) {
	this.screenId = screenid;
}
public long getQuestionId() {
	return questionId;
}
public void setQuestionId(long questionId) {
	this.questionId = questionId;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
public String getScreenText() {
	return screenText;
}
public void setScreenText(String screenText) {
	this.screenText = screenText;
}


}
