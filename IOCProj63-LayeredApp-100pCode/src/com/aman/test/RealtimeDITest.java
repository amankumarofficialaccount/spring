package com.aman.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.aman.config.AppConfig;
import com.aman.controller.MainController;
import com.aman.vo.StudentVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		//BeanFactory factory=null;
		ApplicationContext ctx = null;
		MainController controller=null;
		String result=null;
		StudentVO  vo=null;
		Scanner sc=null;
		String name=null,addrs=null,m1=null,m2=null,m3=null,sno=null;
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("Enter Student no::");
		sno=sc.next();
		System.out.println("Enter Student name::");
		name=sc.next();
		System.out.println("Enter Student address::");
		addrs=sc.next();
		System.out.println("Enter marks1::");
		m1=sc.next();
		System.out.println("Enter Student marks2::");
		m2=sc.next();
		System.out.println("Enter Student marks3::");
		m3=sc.next();
		//create StudentVO class object
		vo=new StudentVO();
		vo.setSno(sno);
		vo.setSname(name);
		vo.setSadd(addrs);
		vo.setM1(m1); vo.setM2(m2); vo.setM3(m3);
		//create IOC container
		//factory=new XmlBeanFactory(new ClassPathResource("com/aman/cfgs/applicationContext.xml"));
		//get Bean Controller class object
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		controller=ctx.getBean("controller",MainController.class);

		try {
			result=controller.processStudent(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("Internal Problem ----> try again..");
			e.printStackTrace();
		}
	}//main
}//class
