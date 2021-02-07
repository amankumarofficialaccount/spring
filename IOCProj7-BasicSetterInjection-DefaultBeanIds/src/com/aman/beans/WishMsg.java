package com.aman.beans;

import java.util.Date;

public class WishMsg {
	
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generate(String user) {
		
		int hour = 0;
		
		hour = date.getHours();
		
		if(hour<=10)
			return "Good Morning "+user;
		else if(hour<=12)
			return "Good Afternoon "+user;
		else if(hour<=16)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
		
		
	}

}
