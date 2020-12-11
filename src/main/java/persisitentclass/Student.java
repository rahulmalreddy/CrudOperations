package persisitentclass;

public class Student {

	
	private int sid;
	private String sname;
	private String mail;
	private int phno;
	public Student(int sid, String sname, String mail, int phno) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.mail = mail;
		this.phno = phno;
	}
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	

}
