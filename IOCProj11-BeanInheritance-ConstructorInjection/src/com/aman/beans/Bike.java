package com.aman.beans;

public class Bike {
	
	private String regNo;
	private String ownerName;
	private long engineNo;
	private String color;
	private String model;
	private String vendor;
	private String engineCC;
	private String idleSpeed;
	private String idleMilage;
	private String fuelTankCapacity;
	
	
	
	public Bike(String regNo, String ownerName, long engineNo, String color, String model, String vendor,
			String engineCC, String idleSpeed, String idleMilage, String fuelTankCapacity) {
		super();
		this.regNo = regNo;
		this.ownerName = ownerName;
		this.engineNo = engineNo;
		this.color = color;
		this.model = model;
		this.vendor = vendor;
		this.engineCC = engineCC;
		this.idleSpeed = idleSpeed;
		this.idleMilage = idleMilage;
		this.fuelTankCapacity = fuelTankCapacity;
	}



	@Override
	public String toString() {
		return "Bike [regNo=" + regNo + ", ownerName=" + ownerName + ", engineNo=" + engineNo + ", color=" + color
				+ ", model=" + model + ", vendor=" + vendor + ", engineCC=" + engineCC + ", idleSpeed=" + idleSpeed
				+ ", idleMilage=" + idleMilage + ", fuelTankCapacity=" + fuelTankCapacity + "]";
	}

}
