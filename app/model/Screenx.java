package model;

public class Screenx {
private long id;
private int type;
private String text;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public Screenx(long id, int type, String text) {
	super();
	this.id = id;
	this.type = type;
	this.text = text;
}


}
