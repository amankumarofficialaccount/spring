package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.CheckVotingEligibility;

public class BeanLifecycleProgramaticApproach {
	
	public static void main(String[] args) {
	
	ApplicationContext ctx = null;
	CheckVotingEligibility voting = null;
	
	ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
	voting = ctx.getBean("voter",CheckVotingEligibility.class);
	System.out.println(voting.votingEligibility());
	
	((AbstractApplicationContext) ctx).close();
	
	}

}
