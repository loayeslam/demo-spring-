package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		/*
		Person person = new Person();
		User user = new User(person);
		user.getPerson();
	   */
		

		ClassPathXmlApplicationContext context = 
				
				new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		UserInterface user = context.getBean("user",UserInterface.class);
		
		user.getPerson();
		
		
		PersonInterface person = context.getBean("person",PersonInterface.class);
		
		person.begin();
		
		context.close();
		
	
	

		
		
	}
}
