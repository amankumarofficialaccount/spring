package com.aman.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactory implements FactoryBean<Calendar>{
	
	private int year;
	private int month;
	private int day;

	public CalendarFactory(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public Calendar getObject() throws Exception {
		System.out.println("CalendarFactory.getObject()");
		Calendar cal = null;
		cal = Calendar.getInstance();
		cal.set(year-1900, month+1, day);		
		return cal;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("CalendarFactory.getObjectType()");
		return Calendar.class;
	}
	
	@Override
	public boolean isSingleton() {
		System.out.println("CalendarFactory.isSingleton()");
		return true;
	}
	
	

}
