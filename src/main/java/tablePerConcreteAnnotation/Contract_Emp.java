package tablePerConcreteAnnotation;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Concrete_Emp")
@AttributeOverrides({
	@AttributeOverride(name ="Eid", column = @Column),
	@AttributeOverride(name = "Ename",column=@Column)
})
public class Contract_Emp extends Employee{
	  @Column(name="pay_per_hour")  
	private float pay_per_hour;
	  @Column(name="contract_duration")  
	private String contractDuration;
	
	
	public Contract_Emp() {
		super();
	}
	public float getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}
	
	
	public Contract_Emp(int eid, String ename, float pay_per_hour, String contractDuration) {
		super(eid, ename);
		this.pay_per_hour = pay_per_hour;
		this.contractDuration = contractDuration;
	}
	@Override
	public String toString() {
		return "Contract_Emp [pay_per_hour=" + pay_per_hour + ", contractDuration=" + contractDuration + "]";
	}
	
	
	
}
