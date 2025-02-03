package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		/*
		User user = new User();
		user.setEmail("loayEslam@gmail.com");
		user.setTeam("ECPC");
		
		System.out.println(user.getEmail()+" "+user.getTeam());
		*/
		
		/*
		Person person = new Person();
		User user = new User();
		user.setPerson(person);
		user.getPerson();
	    */
		
        
		ClassPathXmlApplicationContext context = 
				
				new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		UserInterface user = context.getBean("user",UserInterface.class);
		
		
		System.out.println(user.getEmail()+" "+user.getTeam());
		
		
		//PersonInterface person = context.getBean("person",PersonInterface.class);
		
		//person.begin();
		
		context.close();
		
	


		
		
	}
}
