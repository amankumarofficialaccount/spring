package com.aman.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.aman.external.ExternalIPLScoreComp;
import com.aman.external.ExternalIPLScoreCompImpl;

public class IPLScoreCompServiceLocatorFactoryBean implements FactoryBean<ExternalIPLScoreComp> {

	private String  jndi;
	private Map<String,ExternalIPLScoreComp> cacheMap=null;

	
	public IPLScoreCompServiceLocatorFactoryBean(String jndi) {
		this.jndi = jndi;
		cacheMap = new HashMap();
	}

	@Override
	public ExternalIPLScoreComp getObject() throws Exception {
		
		ExternalIPLScoreComp extComp = null;
		
		if(!cacheMap.containsKey(jndi)) {
			
			extComp = new ExternalIPLScoreCompImpl();
			cacheMap.put(jndi, extComp);
		}
		return cacheMap.get(jndi);
			
		}
		

	@Override
	public Class<?> getObjectType() {
		return ExternalIPLScoreComp.class;
	}
	
	  @Override
	public boolean isSingleton() {
		return true;
	}

}
