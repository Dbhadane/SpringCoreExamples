package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
	
	   public static void main(String[] args) {
		   AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		      
		   
		   HelloWorld o =  context.getBean("h1", HelloWorld.class);
		      
		      System.out.println(o);
		     context.close();
		   }
		}

