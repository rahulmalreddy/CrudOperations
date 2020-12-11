package Rahul.maven.CrudOperations;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Employee {
	@Id
	@Column(name = "EID")
	private int eid;
	
	private String ename;
	
	private String edepartment;
	private int esalary;
	private String year;
	
	@OneToOne(targetEntity=Emp_address.class,cascade=CascadeType.ALL) 
	private Emp_address address;
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edepartment=" + edepartment + ", esalary=" + esalary
				+ ", year=" + year + ", address=" + address + "]";
	}
	public String getYear() {
		return year;
	}
	public Employee(int eid, String ename, String edepartment, int esalary, String year, Emp_address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edepartment = edepartment;
		this.esalary = esalary;
		this.year = year;
		this.address = address;
	}
	public Emp_address getAddress() {
		return address;
	}
	public void setAddress(Emp_address address) {
		this.address = address;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdepartment() {
		return edepartment;
	}
	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
public Employee() {
	
}
	
	

}
