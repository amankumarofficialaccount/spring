package com.aman.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.BankLoanDept;
import com.aman.beans.IntrAmountDetails;
import com.aman.editors.IntrAmountDetailsEditor;

public class CustomPropertyEditorTest3 {

	public static void main(String[] args) {
		
	    ApplicationContext ctx = null;
		BankLoanDept dept = null;
		
	   //create IOContainer
		 ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
				
		//get bean class object
		dept = ctx.getBean("bld",BankLoanDept.class);
		
		//invoke method
		System.out.println("Interest Amount Details::"+dept.calcIntrAmount());
		
		
		
	}
	

}
