package com.t1;

public class Order 
{
	 @Override
	public String toString() {
		return "Order [item=" + item + ", address=" + address + "]";
	}
	private String item;
	   
	    private String address;
	 
	    public String getItem() {
	        return item;
	    }
	    public void setItem(String item) {
	        this.item = item;
	    }
	  
	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }

}
