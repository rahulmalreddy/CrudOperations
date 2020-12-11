package tableperSubClass;

public class Employee {
	
	private int Eid;
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
