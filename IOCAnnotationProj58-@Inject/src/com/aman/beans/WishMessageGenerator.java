package com.aman.beans;

import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class WishMessageGenerator {
	
	/*
    @Inject
    //To Solve Ambiguity Problem
    @Named("cal1")   
    */
	private Calendar calendar;
	
	
	/*
		
    @Inject
    @Named("cal")   

	public WishMessageGenerator(Calendar calendar) {
		this.calendar = calendar;
	}
	*/
    
	/*
    //To Solve Ambiguity Problem Other Than Named
    @Inject
    public WishMessageGenerator(Calendar cal) {
		this.calendar = cal;
	}
	*/
	
	/*
	//To Solve Ambiguity problem With The Hepl of Qualify
	@Inject
	//@Named("c1")  //It Can not solve ambiguity Problem
    public WishMessageGenerator(@Qualifier("c1")Calendar calendar) {
		this.calendar = calendar;
	}
	*/
    
	/*
	 Can Be Applied On Constructor Method
   @Inject
   @Named("cal1")
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	*/
	
	//Can be Applied On Arbitarty Method
	@Inject
	//@Named("cal1")
	//Remove @Named for Ambiguity Problem
	
	public void assign(@Named("cal1")Calendar calendar) {
		this.calendar = calendar;
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
