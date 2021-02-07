package com.aman.singleton;

public class Printer {
	
	private static Printer instance;
	
	private Printer() {
		System.out.println("Printer:0-Param Constructor");
	}
	
	public static Printer getInstance() {
		if(instance==null) 
			instance = new Printer();
		return instance;
		
	}
	
	

}
