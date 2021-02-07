package com.aman.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages={"com.aman.beans","com.aman.replacer"})
@ImportResource("classpath:com/aman/cfgs/applicationContext.xml")
public class AppConfig {

}
