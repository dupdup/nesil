package model;

public class AddressJSON {
private String text;
private int code;

public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public AddressJSON(String text, int code) {
	super();
	this.text = text;
	this.code = code;
}


}
