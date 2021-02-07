package com.aman.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component("ptb")
/*
@PropertySource(value="classpath:com/aman/commons/info.properties")
@PropertySource(value="classpath:com/aman/commons/info1.properties")  */

@PropertySources(value={@PropertySource(value="classpath:com/aman/commons/info.properties"),
@PropertySource(value="classpath:com/aman/commons/info1.properties")})

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
