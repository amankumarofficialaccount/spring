package com.aman.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aman.beans.Employee;
import com.aman.beans.Marks;
import com.aman.beans.Student;

public class ConstructorInjectionTest2 {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Student stud  = null;
		Marks mark = null;
		Employee empl = null;
		
		//Craete IOC Container
		 // factory = new XmlBeanFactory(new ClassPathResource("com/aman/cfgs/applicationContext.xml"));
		//Create Bean Factory
		
		  factory = new DefaultListableBeanFactory();
		  reader = new XmlBeanDefinitionReader(factory);
		  reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		  
		  stud = factory.getBean("st", Student.class);
		  System.out.println(stud);
		  
		  mark = factory.getBean("mar", Marks.class);
		  System.out.println(mark);
		  System.out.println("------------------");
		  
		  empl = factory.getBean("emp", Employee.class);
		  System.out.println(empl);
		  
		  
		
	}

}
