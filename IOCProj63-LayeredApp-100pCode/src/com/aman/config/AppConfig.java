package com.aman.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages={"com.aman.dao","com.aman.service"})
@PropertySource("classPath:com/aman/commons/jdbc.properties")
public class AppConfig {

	@Bean(name="bds")
	public BasicDataSource createBDS() {
		
		System.out.println("AppConfig.createBDS()");
		
		BasicDataSource bds = null;
		
		bds = new BasicDataSource();
		bds.setDriverClassName("org.gjt.mm.mysql.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/DataBase1");
		bds.setUsername("root");
		bds.setPassword("AmanShweta22@");
		return bds;
	}
}
