package com.aman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.Student;

public class RequiredAnnotationTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		Student stud = null;
		
		
		//Create IOContainer
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		//Import Bean
		stud = ctx.getBean("st",Student.class);
		
		System.out.println(stud);
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
		
	}

}
