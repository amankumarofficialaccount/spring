package com.aman.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.aman.beans.WishMsgGenerator;

public class PojoTest {

	public static void main(String[] args) {

				//ClassPathResource res = null;
		        FileSystemResource res = null;
				//BeanFactory factory = null; 
		        XmlBeanFactory factory = null;
				WishMsgGenerator bean = null; 
				
				//locate bean class
				//res = new ClassPathResource("applicationContext.xml");
				res = new FileSystemResource("src/com/aman/cfgs/applicationContext.xml");

				
				//create bean factory
				factory = new XmlBeanFactory(res);
				
				//locate the object
				bean = factory.getBean("wish",WishMsgGenerator.class);
				
				//Generate B.logic
				String result = bean.GenerateWishMsg();
				System.out.println(result);
				
		
	}

}
