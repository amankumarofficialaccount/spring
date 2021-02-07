package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.Bike;

public class BeanInheritanceTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory =  null;
		XmlBeanDefinitionReader reader = null;
		Bike b1=null, b2=null, b3=null;
		
		//Create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Craete Object for  Bike
		b1=factory.getBean("AmanBike",Bike.class);
		System.out.println(b1);
		b2=factory.getBean("ShwetaBike",Bike.class);
		System.out.println(b2);
		b3=factory.getBean("baseBike",Bike.class);
		System.out.println(b3);
	}

}
