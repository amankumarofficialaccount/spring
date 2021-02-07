package com.aman.beans;

public class RequestHandler {
	
	private static int count;
	
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:0-Param Constructor");
	}
	
	public void handleRequest(String data) {
		System.out.println("Handling Request "+data);
		
	}

}
