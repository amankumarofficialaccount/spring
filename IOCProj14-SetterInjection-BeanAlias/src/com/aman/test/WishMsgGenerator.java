package com.aman.test;




import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.WishMsg;

public class WishMsgGenerator {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory= null;
        XmlBeanDefinitionReader reader = null;
        WishMsg wmg1 = null, wmg2= null, wmg3=null;
		
		//Create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Get Object of WishMsg
		wmg1 = factory.getBean("wmgae",WishMsg.class);
		wmg2 = factory.getBean("wmgaex",WishMsg.class);
		wmg3 = factory.getBean("wmgaex1",WishMsg.class);
		System.out.println(wmg1.hashCode()+" "+wmg2.hashCode()+" "+wmg3.hashCode());
		
	}

}
