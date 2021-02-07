package com.aman.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.Printer;
import com.aman.beans.WishMsgGenerator;

public class SetterInjectionBeanScopeTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		WishMsgGenerator generator1 = null, generator2 = null;
		Printer p1=null, p2 = null;
		
		
		
		//Create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Get Bean class Object
		generator1 = factory.getBean("wish",WishMsgGenerator.class);
		generator2 = factory.getBean("wish",WishMsgGenerator.class);
		System.out.println("Generator 1 Hash Code::"+generator1.hashCode()+" Generator2 Hash code:: "+generator2.hashCode());
		System.out.println("generator1==generator2?"+(generator1==generator2));
		
		System.out.println("------------------------------");
		
		//Get printer class Object
		p1 = factory.getBean("prnt",Printer.class);
		p2 = factory.getBean("prnt",Printer.class);
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("p1==p2?"+(p1==p2));
	}

}
