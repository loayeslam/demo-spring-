package com.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String [] args) {
		

	ClassPathXmlApplicationContext context = 
			
			new ClassPathXmlApplicationContext("applicationContext.xml");
	  
	PersonInterface admin1 = context.getBean("admin",PersonInterface.class);
	
	PersonInterface admin2 = context.getBean("admin",PersonInterface.class);
	
	
       admin1.name();
       admin2.name();
       
       System.out.println(admin1);
       System.out.println(admin2);
       
       System.out.println(admin1==admin2);
	
	  context.close();
	}
}
