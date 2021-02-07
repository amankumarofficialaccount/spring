package com.aman.beans;

import java.util.Date;

public class WishMsgGenerator {
	
	private Date date;
	
	static {
		System.out.println("WishMsgGenerator::Static Block");
	}
	
	public WishMsgGenerator() {
		System.out.println("WishMsgGenerator::0-Param Constructor");
	}
	
	public void setDate(Date date) {
		System.out.println("WishMsgGenerator:Set Date");
		this.date = date;
	}

	public String WishGenerate(String user) {
		
		System.out.println("WishMsgGenerator:generateMethod(-)");
		
		int hour = 0;
		
		hour = date.getHours();
		
		if(hour<=12)
			return "Good Morning::"+user;
		else if(hour<=16)
			return "Good Afternoon::"+user;
		else if(hour<=20)
			return "Good Evening::"+user;
		else
			return "Good Night";
	}

}
