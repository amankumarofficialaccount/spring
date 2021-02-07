package com.aman.editors;

import java.beans.PropertyEditorSupport;



import com.aman.beans.IntrAmountDetails;

public class IntrAmountDetailsEditor extends PropertyEditorSupport {
	
	
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		float pamt=0.0f;
		float rate=0.0f;
		float time=0.0f;
		IntrAmountDetails details = null;
		
		//get content from value Attribute
		pamt=Float.parseFloat(text.substring(0,text.indexOf(",")));
		rate=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
		time=Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
		
		//Create Intr Amount Details Object
		details = new IntrAmountDetails();
		details.setpamt(pamt);
		details.setRate(rate);
		details.setTime(time);
		
		//set Value Object to property
		setValue(details);
		
	}


}
