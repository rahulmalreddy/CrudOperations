package tablePerConcreteAnnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name ="Employee")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column (name ="Eid")
	private int Eid;
	@Column (name ="Ename")
	private String Ename;
	
	public Employee() {
		super();
	}
	public Employee(int eid, String ename) {
		super();
		Eid = eid;
		Ename = ename;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + "]";
	}
	
	

}
