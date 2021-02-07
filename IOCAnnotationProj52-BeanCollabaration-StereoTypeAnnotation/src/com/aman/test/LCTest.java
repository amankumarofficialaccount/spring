package com.aman.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.aman.beans.Flipkart;

public class LCTest {

	public static void main(String[] args) {
		
	    ApplicationContext ctx = null;
		Flipkart bean = null;
		String billmsg = null;
		
		//create ioc container
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
         
         //create the object
         bean = ctx.getBean("fpkt",Flipkart.class);
         billmsg = bean.purchase(new String[]{"shirt", "mobile", "books"});
         System.out.println(billmsg);
         
         
	 
	}

}
