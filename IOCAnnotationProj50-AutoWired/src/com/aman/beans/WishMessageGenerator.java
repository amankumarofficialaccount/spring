package com.aman.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {
	
	@Autowired
	//To Solve Ambiguity Problem
//	@Qualifier("cal1")
	
	//For First Day Of Week value 1
//	@Qualifier("cal")
	
	//For First Day of Week value 0
//	@Qualifier("cal1")

	//@Qualifier("c1") value first Day of Week-1
	
	//@Qualifier("c2") //value first Day of Week-1


	private Calendar calendar;
	
	/*
	@Autowired
	public WishMessageGenerator(Calendar calendar) {
		this.calendar = calendar;
	}
	
	*/

	/*
	@Autowired()
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}  */
	
	
	@Autowired()
	public void setCalendar(Calendar cal) {
		this.calendar = cal;
	}  
	
	
	

	public String generate(String user) {
		
		System.out.println(calendar);
		
		int hour = 0;
		
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		if (hour<12)
			return "Good Morning"+user;
		else if (hour<16)
			return "Good Afternoon"+user;
		else if(hour<20)
			return "Good Evening"+user;
		else
			return "Good Night";
		
		
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [calendar=" + calendar + "]";
	}
	
	

}
