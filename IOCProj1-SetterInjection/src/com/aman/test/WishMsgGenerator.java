package com.aman.test;




import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.aman.beans.WishMsg;

public class WishMsgGenerator {

	public static void main(String[] args) {
		
		Resource res = null;
		BeanFactory factory  = null;
		Object obj = null;
		WishMsg wmg = null;


		//Locate The Spring Bean File
		res = new FileSystemResource("src/com/aman/cfgs/applicationContext.xml");
		
		//Create IOC Container
		factory = new XmlBeanFactory(res);
		
		//Get Bean (Main Bean)
		obj = factory.getBean("wish");
		
		//type casting
		wmg = (WishMsg)obj;
		
		//invoke business Method
		System.out.println("Message::"+wmg.generateWishMsg("aman"));
		
	}

}
