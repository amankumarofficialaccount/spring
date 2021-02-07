package com.aman.beans;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Named("wmg")
public class WishMessageGenerator {

	//@Resource  Running Successfully for one bean
	//@Resource(name="cal1")  Running Successfully for 2 bean
	//@Resource  Withou Name If 2 Bean Then Ambiguity Problem
   // @Resource(name="cal1")  //If Ambiguity Problem came solve by name
	/*
	@Resource
	@Named("cal1")   Both can solve ambiguity problem*/
	
	
	@Resource
	@Named("cal1")
	private Calendar calendar;
	
	/*
	@Resource  Resource Annotation is not allowed at constructor
	public WishMessageGenerator(Calendar calendar) {
		this.calendar = calendar;
	}
	*/

	/*
	@Resource(name="cal1")
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	

	@Resource(name="cal1")
	public void assign(Calendar calendar) {
		this.calendar = calendar;
	}
	*/

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
