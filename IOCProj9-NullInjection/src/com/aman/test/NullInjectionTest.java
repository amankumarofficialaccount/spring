package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.AadaharCardInfo;

public class NullInjectionTest {

	public static void main(String[] args) {
       
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		AadaharCardInfo info = null;
		
		//Create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Get Bean Class Object
		info = factory.getBean("ainfo", AadaharCardInfo.class);
		System.out.println(info);
	}

}
