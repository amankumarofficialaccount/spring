package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		BankService service=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("bankService",BankService.class);
		System.out.println("class name ::"+service.getClass()+"  super class::"+service.getClass().getSuperclass());
		//invoke b.method
		System.out.println("Simple Intrest Amount:::"+service.calcSimpleIntrAmount(100000, 12));
		//close container
		((AbstractApplicationContext) ctx).close();


	}

}
