package com.aman.beans;

import org.springframework.stereotype.Component;

//@Component("bankService")
@Component("bankService")

public class BankService {
	

	
	public static float calcIntrAmount(float pAmt,float time) {
		
		// System.out.println("Anamika");
		
	    return  (pAmt*time*2.0f)/100.0f;
	    
	}

}
