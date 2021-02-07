package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.PropsTestBean;

public class PropertiesAnnotationTest {

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		PropsTestBean ptbt = null;
		
		//Create IOContainer
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		//Get Bean
		ptbt = ctx.getBean("ptb",PropsTestBean.class);
		
		//invoke method
		System.out.println(ptbt);
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
