package com.aman.beans;

import org.springframework.stereotype.Component;

@Component("rh")
public class RequestHandler {
	
	private static int count;
	
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:0-Param Constructor-->"+count);
	}
	
	public void handleRequest(String data) {
		System.out.println("Request Handler is Handling Request::"+data);
	}
	
	

}
