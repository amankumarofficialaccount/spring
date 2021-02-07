package com.aman.beans;

public class MyWebContainer {
	
	private RequestHandler handler;
	
	public MyWebContainer(RequestHandler handler) {
		System.out.println("MyWebContainer:1-Param Constructor");
		this.handler = handler;
	}
	
	public void processRequest(String data) {
		System.out.println("Web Container is Processing Request");
		handler.handleRequest(data);
	}
	
	
	

}
