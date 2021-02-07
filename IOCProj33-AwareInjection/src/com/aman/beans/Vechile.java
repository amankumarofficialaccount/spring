package com.aman.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Vechile implements ApplicationContextAware {
	
	private String beanId;
	private ApplicationContext ctx;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	public void setApplicationContext(ApplicationContext ctx) {
		this.ctx = ctx;
	}
	
	public void entertainment() {
		System.out.println("Vechile is Equipped With Sound System");
	}
	
	public void soundHorn() {
		System.out.println("Vechile is Equipped With SoundHorn");
	} 
	
	
	public void journey(String start, String end) {
		
		
		Engine engg = null;
		
		engg = ctx.getBean(beanId,Engine.class);
		
		engg.start();
		System.out.println("Journey is Started From " + start +" to "+end);
		engg.stop();
		System.out.println("Journey is Ended From " + start +" to " +end);

		
	}
	

}
