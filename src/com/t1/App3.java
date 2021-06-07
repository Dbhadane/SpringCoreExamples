package com.t1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Sbeans.xml");
		
		Payment p=(Payment) context.getBean("payment1");
		
		System.out.println(p);
	}

}
