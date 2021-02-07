package com.aman.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.aman.external.ExternalIPLScoreComp;
import com.aman.external.ExternalIPLScoreCompImpl;

public class IPLScoreCompServiceLocatorFactoryBean {

   private static Map<String, ExternalIPLScoreComp> cacheMap = new HashMap();
   
   public static ExternalIPLScoreComp getExtService(String jndi) {
	   
	   ExternalIPLScoreComp extComp = null;
	   
	   if(!cacheMap.containsKey(jndi)) {
		   
		   extComp = new ExternalIPLScoreCompImpl();
		   cacheMap.put(jndi, extComp);
	   }
	   return cacheMap.get(jndi);
	   
   }
   
   

}
