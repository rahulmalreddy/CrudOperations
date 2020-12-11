package OneToMany_ManyToOne;

import javax.persistence.*;




@Entity
public class Answer {
	
	@Id
	@Column(name ="A_id")
	private int Aid;
	
	private String answerf;
    @ManyToOne
	private Question question;

	public Answer(int aid, String answerf) {
		super();
		Aid = aid;
		this.answerf = answerf;
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



	public Answer() {
		super();
	}
    
    
   
	
	
	

}
