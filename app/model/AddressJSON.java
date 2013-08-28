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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + code;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AddressJSON other = (AddressJSON) obj;
	if (code != other.code)
		return false;
	return true;
}


}
