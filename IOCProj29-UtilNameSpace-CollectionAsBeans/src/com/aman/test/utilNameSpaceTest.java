package com.aman.test;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class utilNameSpaceTest {

	public static void main(String[] args) {
       
		ApplicationContext ctx = null;
		List<String> list1 = null;
		List<Date> list2 = null;
		Set<Long> set1 = null;
		Set<Date> set2 = null;
		Map<String,Date> map1 = null;
		Properties props1, props2 = null;
		Float mPI = null;
		
		
		//Create IOContainer
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		
		list1 = ctx.getBean("list1",List.class);
		System.out.println("List====>"+list1+"Type===>"+list1.getClass());
		System.out.println("---------------------------------");
		list2 = ctx.getBean("list2",List.class);
		System.out.println("List====>"+list2+"Type====>"+list2.getClass());
		System.out.println("----------------------------------");
		set1 = ctx.getBean("set1",Set.class);
		System.out.println("Set====>"+set1+"Type=====>"+set1.getClass());
		System.out.println("----------------------------------");
		set2 = ctx.getBean("set2",Set.class);
		System.out.println("Set====>"+set2+"Type====>"+set2.getClass());
		System.out.println("----------------------------------");
		map1 = ctx.getBean("map1",Map.class);
		System.out.println("Map=====>"+map1+"Type====>"+map1.getClass());
		props1 = ctx.getBean("props1",Properties.class);
		System.out.println("Properties1====>"+props1+"Type====>"+props1.getClass());
		System.out.println("----------------------------------");
		props2 = ctx.getBean("props2",Properties.class);
		System.out.println("Properties2====>"+props2);
		System.out.println("----------------------------------");
		mPI = ctx.getBean("mPI",Float.class);
		System.out.println("mPI=====>"+mPI+"Type====>"+mPI.getClass());
		
		
		
		
	}

}
