package com.t1;

public class Grade 
{
	private String gtype;
	public Grade() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public Grade(String gtype) {
		super();
		this.gtype = gtype;
	}

	public String getGtype() {
		return gtype;
	}
	public void setGtype(String gtype) {
		this.gtype = gtype;
	}
	@Override
	public String toString() {
		return "Grade [gtype=" + gtype + "]";
	}
}
