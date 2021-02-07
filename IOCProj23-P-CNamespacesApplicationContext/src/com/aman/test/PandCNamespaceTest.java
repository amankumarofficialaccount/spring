package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.Employee;

public class PandCNamespaceTest {

	public static void main(String[] args) {
       
	    ApplicationContext ctx = null;
		Employee emp = null;
		
	   // ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		//only spring bean configuration 
		 ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		//Create Object
		emp = ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		
		//close container
		((AbstractApplicationContext)ctx).close();
		
	}

}
