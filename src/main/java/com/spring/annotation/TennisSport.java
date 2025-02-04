package com.spring.annotation;

import org.springframework.stereotype.Component;
@Component("ts")

public class TennisSport implements SportInterface {
	
	@Override
	public void mySport() {
	System.out.println("I am Tennis");
		
	}
}
