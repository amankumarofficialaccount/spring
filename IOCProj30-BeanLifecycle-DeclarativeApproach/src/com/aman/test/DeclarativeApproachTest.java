package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.checkVotingEligibility;

public class DeclarativeApproachTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		checkVotingEligibility voting = null;
		
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		voting=ctx.getBean("voter",checkVotingEligibility.class);
		 System.out.println(voting.votingEligibility());
		((AbstractApplicationContext)ctx).close();

	}

}
