package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface {
	
	private SportInterface sportInterface;
	
	@Autowired
	public Master(SportInterface sportInterface) {
		this.sportInterface = sportInterface;
	}

	@Override
	public void name() {
		System.out.println("I am Master");
	}
   @Override
	public void callMySport() {
		sportInterface.mySport();
	}

}
