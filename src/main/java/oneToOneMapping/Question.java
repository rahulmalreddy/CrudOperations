package oneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Question {
	@Id
	@Column(name = "q_id")
	private int Qid;
	private String Qname;
	
	@OneToOne
	private Answer answer;

	public int getQid() {
		return Qid;
	}

	public void setQid(int qid) {
		Qid = qid;
	}

	public String getQname() {
		return Qname;
	}

	public void setQname(String qname) {
		Qname = qname;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int qid, String qname, Answer answer) {
		super();
		Qid = qid;
		Qname = qname;
		this.answer = answer;
	}
	
	public Question() {
		
	}

//	@Override
//	public String toString() {
//		return "Question [Qid=" + Qid + ", Qname=" + Qname + ", answer=" + answer + "]";
//	}
//	
//	

}
