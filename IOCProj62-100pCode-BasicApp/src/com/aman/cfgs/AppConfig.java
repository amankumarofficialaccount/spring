package com.aman.cfgs;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.aman.beans")
public class AppConfig {
	
	static {
		System.out.println("AppConfig:Static Method");
	}
	
	public AppConfig() {
		System.out.println("AppConfig:0-Param Constructor");
	}
	
	@Bean(name="cal")
	public Calendar createCalendar() {
		System.out.println("AppConfig.createCalendar()");
		return Calendar.getInstance();
		
	}
	
	
	
	@Bean(name="cal1")  //Exception will be raised
	@Primary   //It will resolve error
	public Calendar createCalendar1() {
		System.out.println("AppConfig.createCalendar()");
		return Calendar.getInstance();
		
	}
	
	
	@Bean(name="dt")
	@Lazy
	@Scope("prototype")  //It Will Not Participate in pre instantation
	public Date createDate() {
		System.out.println("AppConfig.createDate()");
		return new Date();
	}
	

}
