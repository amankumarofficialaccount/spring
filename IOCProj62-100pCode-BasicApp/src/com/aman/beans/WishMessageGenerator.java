package com.aman.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private Calendar calendar;
	
	static {
		System.out.println("WishMessageGenerator:Static Block");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:0-Param Constructor");
	}
	
	public String generateWishMessage(String user) {
		
		int hour = 0;
		
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
	}
	
	
	
	

}
