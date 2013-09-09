package model;

import java.util.List;

public class QuestionJSON {
	private long screenId;
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
	public long getScreenId() {
		return screenId;
	}
	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (screenId ^ (screenId >>> 32));
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + type;
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
		QuestionJSON other = (QuestionJSON) obj;
		if (screenId != other.screenId)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (type != other.type)
			return false;
		return true;
	} 


}
