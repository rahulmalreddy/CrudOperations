package manyToMany;

import java.util.Set;

public class Faculty {
	
	private int fid;
	private String fname;
	private int  fexp;
	
	private Set <Course> course;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getFexp() {
		return fexp;
	}

	public void setFexp(int fexp) {
		this.fexp = fexp;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Faculty(int fid, String fname, int fexp, Set<Course> course) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fexp = fexp;
		this.course = course;
	}

	public Faculty() {
		super();
	}
	
	

}
