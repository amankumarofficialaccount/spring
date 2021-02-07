package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.Employee;

public class PandCNamespaceTest {

	public static void main(String[] args) {
       
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Employee emp = null;
		
		//Create IOCOntainer
		factory  = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Create Object
		emp = factory.getBean("emp",Employee.class);
		System.out.println(emp);
		
	}

}
