package com.aman.beans;

import java.util.Date;

public class AadaharCardInfo {
	
	private int ano;
	private String name;
	private Date dob,doj,dom;
	
	
	public AadaharCardInfo(int ano, String name, Date dob, Date doj, Date dom) {
		super();
		this.ano = ano;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

   
	@Override
	public String toString() {
		return "AadaharCardInfo [ano=" + ano + ", name=" + name + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom
				+ "]";
	}
	
	

}
