package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.ProffessionalCricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
       
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		ProffessionalCricketer prfct = null;
		
		//Create IOContainer
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Get Target Class Object
		prfct = factory.getBean("prfct", ProffessionalCricketer.class);
		prfct.Batting();
		prfct.Bowling();
		prfct.Fielding();
		
	}

}
