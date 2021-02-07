package com.aman.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.aman.beans.BankLoanDept;
import com.aman.beans.IntrAmountDetails;
import com.aman.editors.IntrAmountDetailsEditor;

public class CustomPropertyEditorTestWithBF {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		BankLoanDept dept = null;
		CustomEditorConfigurer configurer = null;
		
		
		
		//create IOContainer
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Register CustomPERegistar with Bean Factory Container
		 // factory.addPropertyEditorRegistrar(new MyCustomPERegistar());
		
		configurer = factory.getBean("cec",CustomEditorConfigurer.class);
		configurer.postProcessBeanFactory(factory);
		
		
		//get bean class object
		dept = factory.getBean("bld",BankLoanDept.class);
		
		//invoke method
		System.out.println("Interest Amount Details::"+dept.calcIntrAmount());
		
		
		
	}
	
	//Nested Inner Class
	private static class MyCustomPERegistar implements PropertyEditorRegistrar{

		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
           registry.registerCustomEditor(IntrAmountDetails.class, new IntrAmountDetailsEditor());			
		}
		
	}

}
