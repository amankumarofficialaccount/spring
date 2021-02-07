package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.checkVotingEligibility;

public class BeanLifecycleTestUsingBF {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		checkVotingEligibility voter = null;
		
		//Create IOContainer
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		voter=factory.getBean("voter",checkVotingEligibility.class);
		
		System.out.println(voter.votingEligibility());
		
		factory.destroySingletons();
		
		
		

	}

}
