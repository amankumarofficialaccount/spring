package com.aman.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	
	public MyBeanPostProcessor() {
		
		System.out.println("MyBeanPostProcessor.MyBeanPostProcessor()");
	}

	
@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	   System.out.println("MyBeanPostProcessor:BeforeInitialization");
	   return bean;
	}

@Override
public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("MyBeanPostProcessor:AfterInitialization");
    return bean;
}
}
