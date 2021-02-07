package com.aman.beans;

public class Printer {
	
	private static Printer instance;
	
	public Printer() {
		System.out.println("Printer::0-Param Constructor");
	}
	
	public static Printer getInstance() {
		
		if(instance==null)
			instance = new Printer();
		
		return instance;
	}

}
