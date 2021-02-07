package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.DecthlonStore;

public class InnerBeanTest {

	public static void main(String[] args) {
		
		//Create IOContainer
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		DecthlonStore store = null;
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		
		//Get Target  Bean Class Object
		store = factory.getBean("dStore", DecthlonStore.class);
		System.out.println(store);
		
	}

}
