package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.MyWebContainer;
import com.aman.beans.RequestHandler;

public class LookupInjectionTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		
		MyWebContainer container=null, container1 = null;
		
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		container = ctx.getBean("container",MyWebContainer.class);
		container.processRequest("hello");
		
		System.out.println("-------------------------------");
		
		container1 = ctx.getBean("container",MyWebContainer.class);
		container1.processRequest("hii");
		
		((AbstractApplicationContext) ctx).close();

	}

}
