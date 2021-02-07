package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.TestBean;

public class BeanLifecycleTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		TestBean tb = null;
		
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
        tb = ctx.getBean("tb", TestBean.class);
        
        System.out.println(tb.sayHello("aman"));
        
        ((AbstractApplicationContext) ctx).close();
		
	}

}
