package com.aman.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantation {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Class c1 = null;
		String s1 = null;
		Calendar cal = null;
		Properties props = null;
		String s3 = null, s4=null;
		
		//Create IOContainer
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Get Bean Class Object
		c1 = factory.getBean("c1",Class.class);
		System.out.println("c1 object class::"+c1.getClass()+" c1 obj data::"+c1.toString());
		
		System.out.println("--------------------------------");
		
		s1 = factory.getBean("s1", String.class);
		System.out.println("s1 object class::"+ s1.getClass()+" s1 obj data::"+s1.toString());
		
		System.out.println("-------------------------------");
		
		cal = factory.getBean("cal", Calendar.class);
		System.out.println("cal object class::"+cal.getClass()+" cal obj data::"+cal.getInstance());
		
		System.out.println("--------------------------------");
		
		props = factory.getBean("props",Properties.class);
		System.out.println("Properties object class::"+props.getClass()+"prop obj data::"+props.toString());
		
		System.out.println("--------------------------------");
		 
		s3 = factory.getBean("s3",String.class);
		System.out.println("String obj Class::"+s3.getClass()+" String obj Data::"+s3.toString());
		
		System.out.println("---------------------------------");
		
		s4 = factory.getBean("s4", String.class);
		System.out.println("String obj Class::"+s4.getClass()+" String obj data::"+s4.toString());
		

	}

}
