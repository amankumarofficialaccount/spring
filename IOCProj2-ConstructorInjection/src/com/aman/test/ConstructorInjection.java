package com.aman.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.aman.beans.WishGenerator;

public class ConstructorInjection {

	public static void main(String[] args) {

		Resource res = null;
		BeanFactory factory = null;
		Object obj = null;
		WishGenerator generator = null;
		
		//locate the spring bean file
		res = new FileSystemResource("src/com/aman/cfgs/applicationContext.xml");
		
		//create bean factory
		factory = new XmlBeanFactory(res);
		
		//Get Bean Class Object
		obj = factory.getBean("wish");
		generator = (WishGenerator)obj;
		//invoke the method
		System.out.println("Message::"+generator.generate("aman"));
	}

}
