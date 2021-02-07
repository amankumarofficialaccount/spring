package com.aman.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Named("voter")
@Component("voter")
@PropertySource(value="classpath:com/aman/commons/VoterDetails.properties")
public class checkVotingEligibility {
	
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private int age;
	@Value("${voter.addrs}")
	private String addrs;
	private Date verifiedON;
	

	@PostConstruct
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
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("checkVotingEligibility.destroy()");
		verifiedON = null;
		name=null;
		age=0;
		addrs=null;
	}
	
	

}
