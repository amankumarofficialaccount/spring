package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.Vechile;

public class AwareInjectionTest   {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		Vechile vechile = null;
		
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		vechile = ctx.getBean("vechile",Vechile.class);
		
		vechile.journey("mot", "mum");
		vechile.entertainment();
		vechile.soundHorn();
		
		
		
		

	}

}
