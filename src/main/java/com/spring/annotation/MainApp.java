package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.UserInterface;

public class MainApp {
	public static void main(String [] args) {
		
		  
				ClassPathXmlApplicationContext context = 
						
						new ClassPathXmlApplicationContext("applicationContext.xml");
				 
		 MasterInterface ci =  context.getBean("master",MasterInterface.class);
		  
		  ci.name();
		
		context.close();
		
	}
}
