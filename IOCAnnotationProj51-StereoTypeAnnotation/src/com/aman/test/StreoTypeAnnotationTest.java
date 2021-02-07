package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.WishMessageGenerator;

public class StreoTypeAnnotationTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		WishMessageGenerator generator = null;
		
		//Create IOContainer
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		//Get Bean
		//generator = ctx.getBean("wmg",WishMessageGenerator.class);
		
		//Default Bean Id is Class Name(Take w small It is not fully qualified class name)
		generator = ctx.getBean("wishMessageGenerator",WishMessageGenerator.class);


		//Invoke Method
		System.out.println(generator.generate("aman"));
		
		//close Container
		((AbstractApplicationContext) ctx).close();

	}

}
