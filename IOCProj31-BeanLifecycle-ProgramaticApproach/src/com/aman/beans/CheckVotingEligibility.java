package com.aman.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckVotingEligibility implements InitializingBean, DisposableBean {
	
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


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("CheckVotingEligibility.afterPropertiesSet()");
		verifiedON = new Date();
		
		if(name==null || age<=0) {
			throw new IllegalArgumentException("Please Enter A valid Name and Age");
		}
		
	}
	
	public void myInit() {
		System.out.println("CheckVotingEligibility.myInit()");
	}
	
	public String votingEligibility() {
		
		System.out.println("CheckVotingEligibility.votingEligibility()");
		if(age<18)
			return "Mr "+name+" u are not eligible for voting verified On"+verifiedON;
		else 
			return "Mr "+name+" u are  eligible for voting verified On"+verifiedON;
		
	}
	

	@Override
	public void destroy() throws Exception {
		System.out.println("CheckVotingEligibility.destroy()");
		verifiedON = null;
		name=null;
		age=0;
		addrs=null;
		
	}
	
	public void myDestroy() {
		System.out.println("CheckVotingEligibility.myDestroy()");
	}
	
	

}
