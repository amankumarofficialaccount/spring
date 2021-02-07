package com.aman.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.aman.beans.WishMsg;

public class SetterInjectionTest {

	public static void main(String[] args) {
        
		Resource res = null;
		BeanFactory factory = null;
		Object obj = null;
		WishMsg generator = null;
		
		//Loacte bean cfgs file
		res = new FileSystemResource("src/com/aman/cfgs/applicationContext.xml");
		
		//Create Ioc Container
		factory = new XmlBeanFactory(res);
		
		//obj = factory.getBean("wmg");
		obj = factory.getBean("com.aman.beans.WishMsg#0");
		generator  = (WishMsg)obj;
		
		//Creta bean class Obj
		//generator = factory.getBean("wmg", WishMsg.class);
		
		System.out.println("Message::"+generator.generate("aman"));
		
		
	}

}
