package com.aman.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Primary
public class dtdc implements courier {
	
	public dtdc() {
	   System.out.println("dtdc:0-paramconstructor");
	}

	@Override
	public String deliver(int orderid) {
         
		
		return "dtdc is ready to deliver product of "+orderid;
		
		
	}

}
