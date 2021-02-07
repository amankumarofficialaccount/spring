package com.aman.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public abstract class MyWebContainer {
	
	public MyWebContainer() {
		System.out.println("MyWebContainer:0-Param Constructor");
	}
	
	@Lookup(value="rh")
	public abstract RequestHandler createRequestHandler() ;
	
	
		public void processRequest(String data) {
			
			System.out.println("Web Container is Processing Request");
			
			RequestHandler handler = null;
			
			//Get Dependent class Object
			
			handler = createRequestHandler();
			handler.handleRequest(data);
			
		}
		
	
	
	}
