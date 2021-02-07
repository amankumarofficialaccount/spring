package com.aman.beans;

public class BankService {
	

	//Here Method Should not be static Otherwise it can't be replaced
	public  float calcIntrAmount(float pAmt,float time) {
		
		// System.out.println("Anamika");
		
	    return  (pAmt*time*2.0f)/100.0f;
	    
	}

}
