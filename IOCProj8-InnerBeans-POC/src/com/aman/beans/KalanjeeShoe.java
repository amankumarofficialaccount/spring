package com.aman.beans;

public class KalanjeeShoe {
	
	private String shoeType;
	private String priceRange;
	
	
	public void setShoeType(String shoeType) {
		this.shoeType = shoeType;
	}
	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}
	@Override
	public String toString() {
		return "KalanjeeShoe [ShoeType=" + shoeType + ", priceRange=" + priceRange + "]";
	}
	
	

}
