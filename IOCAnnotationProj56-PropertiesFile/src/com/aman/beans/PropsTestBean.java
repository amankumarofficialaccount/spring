package com.aman.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ptb")
public class PropsTestBean {
	
	@Value("${user.name}")
	private String name;
	@Value("${user.age}")
	private int age;
	@Value("${user.addrs}")
	private String addrs;
	@Value("${os.name}")
	private String osName;
	//@Value("${JAVA_HOME}")
	//private String path;
	
	@Override
	public String toString() {
		return "PropsTestBean [name=" + name + ", age=" + age + ", addrs=" + addrs + ", osName=" + osName + "]";
	}
	
	
	
	

}
