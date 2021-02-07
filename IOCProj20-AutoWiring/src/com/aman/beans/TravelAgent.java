package com.aman.beans;

public class TravelAgent {
   
	private TourPlan tp;
	
	public TravelAgent() {
		System.out.println("TravelAgent::0-ParamConstructor");
	}

	public TravelAgent(TourPlan tp1) {
		System.out.println("TravelAgent::1-ParamConstructor");
		this.tp = tp1;
	}

	public void setTp(TourPlan tp) {
		this.tp = tp;
	}
	
	public void holidayPlan() {
		System.out.println(tp.toString()+"places are visited");
	}
	
	
}
