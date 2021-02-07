package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.AadaharCardInfo;

public class BuiltInPropertyEditors {

	public static void main(String[] args) {
		
		ApplicationContext ctx  = null;
		AadaharCardInfo card = null;
		
		
		//Create IOContainer
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
        card = ctx.getBean("aCard",AadaharCardInfo.class);
        System.out.println(card);
        
        //close container
        ((AbstractApplicationContext) ctx).close();
		
		
	}

}
