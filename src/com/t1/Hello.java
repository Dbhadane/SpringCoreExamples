package com.t1;

public class Hello implements Iword {

	private String message;
	public void setMessage(String message)
	{
		this.message = message;
	}
	@Override
	public void getMessage() {
		System.out.println("In hello Message-->"+message);

	}
	
	

}
