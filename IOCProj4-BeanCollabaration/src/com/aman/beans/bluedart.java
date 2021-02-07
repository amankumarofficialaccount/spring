package com.aman.beans;

public class bluedart implements courier {
	
	public bluedart() {
		System.out.println("bluedart:0-paramConstructor");
	}

	@Override
	public String deliver(int orderid) {
		
		
		return "bluedart is ready to deliver product of "+orderid;
      
	}

}
