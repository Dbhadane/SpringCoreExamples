package com.t1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	  Iword o=(Iword) context.getBean("ss");
		o.getMessage();
		  Iword o1=(Iword) context.getBean("qq");
			o1.getMessage();
	}

}
