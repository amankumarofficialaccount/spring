package com.aman.beans;

public class BankService {
	

	
	//public static float calcIntrAmount(float pAmt,float time) {
	
	//Use of static keyword will not let ypu modify the previous value
	
	
	public  float calcIntrAmount(float pAmt,float time) {

		
		// System.out.println("Anamika");
		
	    return  (pAmt*time*2.0f)/100.0f;
	    
	}

}
