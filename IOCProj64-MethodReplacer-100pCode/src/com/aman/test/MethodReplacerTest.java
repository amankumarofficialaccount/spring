package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.BankService;
import com.aman.config.AppConfig;

public class MethodReplacerTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx  = null;
		BankService service = null;
		
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		service = ctx.getBean("bankService",BankService.class);
		
		System.out.println("Simple Intr Amount::"+service.calcIntrAmount(100000, 12));
		
		((AbstractApplicationContext) ctx).close();

	}

}
