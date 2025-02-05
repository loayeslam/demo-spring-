package com.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String [] args) {
		

	ClassPathXmlApplicationContext context = 
			
			new ClassPathXmlApplicationContext("applicationContext.xml");
	  
	PersonInterface admin1 = context.getBean("admin",PersonInterface.class);
	

	
	
       admin1.name();
     
       
       System.out.println(admin1);
     
	
	  context.close();
	}
}
