package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.aman.beans.WishMessageGenerator;
import com.aman.cfgs.AppConfig;

public class BasicInjectionTest {

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		WishMessageGenerator generator = null;
		
		//create IOContainer
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		/*
		//Get Bean
		generator = ctx.getBean("wmg",WishMessageGenerator.class);
		
		//invoke method
		System.out.println("Result::"+generator.generateWishMessage("aman"));
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
		*/
	}

}
