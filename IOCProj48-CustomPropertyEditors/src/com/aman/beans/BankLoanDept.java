package com.aman.beans;

public class BankLoanDept {
	
	private IntrAmountDetails details;

	public BankLoanDept(IntrAmountDetails details) {
		this.details = details;
	}
	
	public float calcIntrAmount() {
		return (details.getpamt()*details.getRate()*details.getTime())/100.0f;
		
	}

}
