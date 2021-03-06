package com.aman.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("irr")
@PropertySource("classpath:com/aman/commons/info.properties")
public class InterestRateReplacer implements MethodReplacer {
	
	@Value("${intr.rate}")
	private float rate;

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		
		System.out.println("interestRateReplacer.reimplement(-,-,-)");
		
		float pAmt=(Float)args[0];
		
		float time=(Float)args[1];
		
		return (pAmt*time*rate)/100.0f;
	}
	
	
	

}
