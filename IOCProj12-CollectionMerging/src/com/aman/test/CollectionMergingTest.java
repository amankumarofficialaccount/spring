package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.EnggStudent;

public class CollectionMergingTest {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		EnggStudent st = null;
		
		//Create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Get Object of EnggStudent class
		  st = factory.getBean("itFySt", EnggStudent.class);
		  System.out.println(st);
		
		
		
		
	}

}
