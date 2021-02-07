package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.WishMessageGenerator;

public class AutowiredAnnotationTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		WishMessageGenerator generator = null;
		
		//Create IOContainer
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		//Get Bean
		generator = ctx.getBean("wmg" ,WishMessageGenerator.class);
		
		//invoke Method
		System.out.println(generator.generate(" aman"));
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}

}
