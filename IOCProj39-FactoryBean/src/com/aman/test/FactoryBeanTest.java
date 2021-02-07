package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.ScheduleRemainder;

public class FactoryBeanTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx  = null;
		ScheduleRemainder remainder = null;
		
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		remainder = ctx.getBean("remainder",ScheduleRemainder.class);
		
		System.out.println(remainder.remainderOfTheDay());
		
		((AbstractApplicationContext) ctx).close();
		
	}

}
