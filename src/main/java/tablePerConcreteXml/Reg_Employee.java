package tablePerConcreteXml;

public class Reg_Employee  extends Employee{
	
	private float salary;
	private int bonus;
	
	
	public Reg_Employee() {
		super();
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public Reg_Employee(int eid, String ename, float salary, int bonus) {
		super(eid, ename);
		this.salary = salary;
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Reg_Employee [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
	

}
