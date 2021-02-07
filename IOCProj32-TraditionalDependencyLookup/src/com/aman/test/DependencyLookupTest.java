package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.Vechile;

public class DependencyLookupTest {

	public static void main(String[] args) {
		
		Vechile vechile = null;

		ApplicationContext ctx = null;
		
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		vechile = ctx.getBean("vechile",Vechile.class);
		
		vechile.journey("mot", "mum");
		vechile.entertainment();
		vechile.soundHorn();
		
		((AbstractApplicationContext)ctx).close();
		
		
	}

}
