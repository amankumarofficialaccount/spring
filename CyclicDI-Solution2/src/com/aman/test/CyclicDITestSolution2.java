package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.A;
import com.aman.beans.B;

public class CyclicDITestSolution2 {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory =  null;
		XmlBeanDefinitionReader reader = null;
		A a1 = null;
		B b1 = null;
		
		//Create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		a1 = factory.getBean("a1", A.class);
		System.out.println(a1);
		
		//b1 = factory.getBean("b1", B.class);
		//System.out.println(b1);
				
	}

}
