package com.aman.beans;

import java.util.Arrays;

public class TourPlan {
	
	private String[] places;
	private boolean isInsured;

	public void setPlaces(String[] places) {
		this.places = places;
	}

	public void setInsured(boolean isInsured) {
		this.isInsured = isInsured;
	}

	@Override
	public String toString() {
		return "TourPlan [places=" + Arrays.toString(places) + ", isInsured=" + isInsured + "]";
	}

//	@Override
//	public String toString() {
//		return "TourPlan [places=" + Arrays.toString(places) + "]";
//	}

}
