package model;

public class AnswerJSON {

	private String text;
	private long code;
	private int	count;

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long l) {
		this.code = l;
	}
	public AnswerJSON(String text, long code, int count) {
		super();
		this.text = text;
		this.code = code;
		this.count = count;
	}
	public AnswerJSON() {
		super();
	}
	
}
