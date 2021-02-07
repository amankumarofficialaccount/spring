package com.aman.beans;

import java.util.Date;

public class WishMsgGenerator {
	
	private Date date;
	private String name;
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String GenerateWishMsg(){
		
		int hour=date.getHours();
		return "Good Morning::"+name+"--->"+date;
	}

}
