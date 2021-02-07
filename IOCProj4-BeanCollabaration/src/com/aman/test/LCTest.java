package com.aman.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.aman.beans.Flipkart;

public class LCTest {

	public static void main(String[] args) {
		
		Resource res = null;
		BeanFactory factory = null;
		Flipkart bean = null;
		String billmsg = null;
		
		//Locate the resource
         res  = new FileSystemResource("src/com/aman/cfgs/applicationContext.xml");
         
         //create the factory
         factory  = new XmlBeanFactory(res);
         
         //create the object
         bean = factory.getBean("fkt",Flipkart.class);
         billmsg = bean.purchase(new String[]{"shirt", "mobile", "books"});
         System.out.println(billmsg);
         
         
	 
	}

}
