package com.aman.beans;

import java.util.Date;

public class checkVotingEligibility {
	
	private String name;
	private int age;
	private String addrs;
	private Date verifiedON;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	
	public void myInit1() {
         System.out.println("checkVotingEligibility.myInit()");		  
		  verifiedON = new Date();
		  
		if (name==null || age<=0) {
			throw new IllegalArgumentException("Invalid name, age values");
		}
	}
	
	public String votingEligibility() {
		System.out.println("checkVotingEligibility.votingEligibility()");
		if(age<18)
			return "Mr. "+name+" are not eligible for voting verified on "+new Date();
		else
			return "Mr. "+name+" are eligible for voting verifeid on "+new Date();
	}
	
	public void myDestroy() {
		System.out.println("checkVotingEligibility.destroy()");
		verifiedON = null;
		name=null;
		age=0;
		addrs=null;
	}
	
	

}
