package com.aman.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vechile {
	
	private String beanId;

	
	public Vechile() {
		System.out.println("Vechile:0-Param Constructor");
	}
		
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void entertainment() {
		System.out.println("During the journey u can listen Music");
	}
	
	public void soundHorn() {
		System.out.println("Vechile is equipped with sound Horn");
	}
	
	public void journey(String start, String end) {
		
		System.out.println("Journey started from "+ start +" to "+ end );

		ApplicationContext ctx = null;
        Engine engg = null;		
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		engg = ctx.getBean(beanId,Engine.class);
		engg.start();
		System.out.println("Journey ended from "+ start +" to "+ end );
		engg.end();
		
	}

	

}
