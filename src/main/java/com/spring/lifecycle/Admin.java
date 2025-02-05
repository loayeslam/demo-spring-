package com.spring.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Admin implements PersonInterface{
	
	@PostConstruct
	public void init() {
		System.out.println(" DB is connected ");
	}

	@Override
	public void name() {
		
		System.out.println("I am Admin");
	}
	@PreDestroy
	public void destory() {
		System.out.println("DB us disconnected");
	}

}
