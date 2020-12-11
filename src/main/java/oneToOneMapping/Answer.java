package oneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@Column(name ="A_id")
	private int Aid;
	private String answerf;
	@OneToOne(mappedBy ="answer" )
	private Question question;
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getAnswerf() {
		return answerf;
	}
	public void setAnswerf(String answerf) {
		this.answerf = answerf;
	}
	
	public Answer(int aid, String answerf, Question question) {
		super();
		Aid = aid;
		this.answerf = answerf;
		this.question = question;
	}
	public Answer() {
		super();
	}
//	@Override
//	public String toString() {
//		return "Answer [Aid=" + Aid + ", answerf=" + answerf + ", question=" + question + "]";
//	}
	
	

}
