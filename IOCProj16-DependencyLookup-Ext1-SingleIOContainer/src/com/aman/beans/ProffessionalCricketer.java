package com.aman.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class ProffessionalCricketer {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	

	public void Bowling() {
		System.out.println("Cricketer is Bowling");
	}
	
	public void Fielding() {
		System.out.println("Cricketer is Fielding");
	}
	
	public void Batting(BeanFactory factory, CricketerBat bat) {
	    System.out.println(name+"Cricketer is Batting");
	    bat.scoreRuns();
	
	}

}
