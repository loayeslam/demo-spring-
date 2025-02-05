package com.spring.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sport implements SportInterface{
   
	private SportInterface sp;
	
	@Autowired
	public Sport(SportInterface sp) {
		super();
		this.sp = sp;
	}


	@Override
	public void mySport() {
		System.out.println("I am Sport");
		
	}

}
