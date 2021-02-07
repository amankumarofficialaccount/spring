package com.aman.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class ProffessionalCricketer {
	
	private String name;
	private String beanId;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void Bowling() {
		System.out.println("Cricketer is Bowling");
	}
	
	public void Fielding() {
		System.out.println("Cricketer is Fielding");
	}
	
	public void Batting() {
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		CricketerBat bat = null;
		
		//Create IOContainer
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Get Target Class object
		bat = factory.getBean("bat",CricketerBat.class);
		System.out.println(name+" cricketer is batting ");
		bat.scoreRuns();
	}

}
