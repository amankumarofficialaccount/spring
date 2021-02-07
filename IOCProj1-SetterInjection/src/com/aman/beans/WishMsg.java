package com.aman.beans;

import java.util.Date;

public class WishMsg {
	
	private Date date;
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateWishMsg(String user) {
		
	  int hour = 0;
	  
	  hour = date.getHours();
		
		if(hour<12) 
			return "GM::"+user;
		
		else if(hour<16) 
			return "GA::"+user;
		
		else if(hour<20) 
			return "GE::"+user;
		
		else 
			return "GN::"+user;
		
			
	}

}
