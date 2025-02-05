package com.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String []args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		MasterInterface ms = context.getBean("master",MasterInterface.class);
		
		ms.name();
		ms.getSport();
		context.close();
	}

}
