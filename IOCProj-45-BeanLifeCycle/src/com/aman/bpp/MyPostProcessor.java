package com.aman.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {
	
	public MyPostProcessor(){
		System.out.println("MyPostProcessor:0-Param Constructor");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
           System.out.println("MyPostProcessor.postProcessBeforeInitialization()");
		return bean;
	}
	
    @Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
           System.out.println("MyPostProcessor.postProcessAfterInitialization()");
    	return bean;
	}	

}
