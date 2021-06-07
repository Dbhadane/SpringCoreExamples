package com;

public class HelloWorld {
	private int sid;
	private String snmae;
	Batch b;
	public HelloWorld() {
		System.out.println("In default");	
		}
	public int getSid() {
		return sid;
	}
	public Batch getB() {
		return b;
	}
	public void setB(Batch b) {
		this.b = b;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "HelloWorld [sid=" + sid + ", snmae=" + snmae + "b="+b+"]";
	}
	public String getSnmae() {
		return snmae;
	}
	public void setSnmae(String snmae) {
		this.snmae = snmae;
	}
	public HelloWorld(int sid, String snmae, Batch b) 
	{
		super();
		this.sid = sid;
		this.snmae = snmae;
		this.b=b;
		
	}
	public HelloWorld(int sid, String snmae) 
	{
		super();
		this.sid = sid;
		this.snmae = snmae;
		
		
	}
	
}