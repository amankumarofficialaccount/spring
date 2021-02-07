package com.aman.bpp;


import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.aman.bo.BaseBO;

public class DOJBeanPostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("DOJBeanPostProcessor.postProcessBeforeInitialization()");		
		if(bean instanceof BaseBO) {
           System.out.println("for BO");
			((BaseBO)bean).setDoj(new Date());
		}
			return bean;
	
	}

}
