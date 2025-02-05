package com.spring.noxml;

import org.springframework.stereotype.Component;

  

@Component
public class Master implements MasterInterface {
   
	private SportInterface sp;
	
	
	public Master(SportInterface sp) {
		super();
		this.sp = sp;
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("I am master");
	}

	@Override
	public void getSport() {
	sp.mySport();
		
	}

	
}
