package manyToMany;

import java.util.Set;

public class Course {
	
	private int cid;
	private String cname;
	private int cfee;
	
	private Set<Faculty> faculty;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCfee() {
		return cfee;
	}

	public void setCfee(int cfee) {
		this.cfee = cfee;
	}

	public Set<Faculty> getFaculty() {
		return faculty;
	}

	public void setFaculty(Set<Faculty> faculty) {
		this.faculty = faculty;
	}

	public Course(int cid, String cname, int cfee, Set<Faculty> faculty) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
		this.faculty = faculty;
	}

	public Course() {
		super();
	}
	
    
}
