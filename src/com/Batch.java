package com;

public class Batch 
{  
	//simple
	private int bid;
	private String bname;
	private String tname;
	public Batch() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", bname=" + bname + ", tname=" + tname + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}

}
