package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface {
	@Autowired
	@Qualifier("user")
	private CompanyInterface ci;
	
	
   

	@Override
	public void name() {
	  ci.Start();
		
	}

	@Override
	public void callMySport() {
		// TODO Auto-generated method stub
		
	}
	
}
