package tableperHierarchy;

public class Contract_emp  extends Employee2{

	
	 private float pay_per_hour;  
	 private String contract_duration;
	 
		public float getPay_per_hour() {
			return pay_per_hour;
		}
		public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
		}
		
		public String getContract_duration() {
			return contract_duration;
		}
		public void setContract_duration(String contract_duration) {
			this.contract_duration = contract_duration;
		}
		
		public Contract_emp(int id, String name, float pay_per_hour, String contract_duration) {
			super(id, name);
			this.pay_per_hour = pay_per_hour;
			this.contract_duration = contract_duration;
		}  
	    public Contract_emp(){
	    	
	    }
}
