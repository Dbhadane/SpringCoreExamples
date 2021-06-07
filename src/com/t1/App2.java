package com.t1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 
{

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Sbeans.xml");
		Student p=(Student) context.getBean("m1");
		System.out.println(p);

	}

}
