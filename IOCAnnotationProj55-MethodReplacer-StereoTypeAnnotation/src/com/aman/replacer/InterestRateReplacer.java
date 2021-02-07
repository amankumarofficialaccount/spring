package com.aman.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("irr")
public class InterestRateReplacer implements MethodReplacer {
	
	@Value("1.5f")
	private float rate;

	/*
	public void setRate(float rate) {
		this.rate = rate;
	}
	*/

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		
		System.out.println("interestRateReplacer.reimplement(-,-,-)");
		
		float pAmt=(Float)args[0];
		
		float time=(Float)args[1];
		
		return (pAmt*time*rate)/100.0f;
	}
	
	
	

}
