package OneToMany_ManyToOne;

import java.util.List;

import javax.persistence.*;

public class Question {

	@Id
	@Column(name = "q_id")
	private int Qid;
	private String Qname;
	
//	@OneToMany(cascade  = CascadeType.ALL)
	@OneToMany
	private List<Answer> answers;


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


	public List<Answer> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}


	public Question(int qid, String qname, List<Answer> answers) {
		super();
		Qid = qid;
		Qname = qname;
		this.answers = answers;
	}


	public Question() {
		super();
	}
	
	
}
