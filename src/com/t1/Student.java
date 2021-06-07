package com.t1;

public class Student
{
	public Student(String sname, int sid, Grade g) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.g = g;
	}
	private String sname;
	private int sid;
	 Grade g;
public Student() {
	// TODO Auto-generated constructor stub
}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Grade getG() {
		return g;
	}
	public void setG(Grade g) {
		this.g = g;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", g=" + g + "]";
	}
}
