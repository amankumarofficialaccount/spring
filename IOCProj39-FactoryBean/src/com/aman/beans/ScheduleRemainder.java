package com.aman.beans;

import java.util.Calendar;

public class ScheduleRemainder {
	
	private Calendar dob;

	public ScheduleRemainder(Calendar dob) {
		this.dob = dob;
	}
	
	public String remainderOfTheDay() { 
		
		Calendar sysDate = null;
		sysDate = Calendar.getInstance();
		
		System.out.println(sysDate);
		
		if((dob.get(Calendar.MONTH)==sysDate.get(Calendar.MONTH)+1) && (dob.get(Calendar.DATE)==sysDate.get(Calendar.DATE)) )
           return "Today is BirthDay Keep More Money in Pocket";
        else
           return "No Appointments...Plan As Required";
	}

}
