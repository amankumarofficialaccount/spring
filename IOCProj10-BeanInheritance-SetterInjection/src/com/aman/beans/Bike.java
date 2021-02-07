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
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setEngineNo(long engineNo) {
		this.engineNo = engineNo;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public void setIdleSpeed(String idleSpeed) {
		this.idleSpeed = idleSpeed;
	}
	public void setIdleMilage(String idleMilage) {
		this.idleMilage = idleMilage;
	}
	public void setFuelTankCapacity(String fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}
	
	@Override
	public String toString() {
		return "Bike [regNo=" + regNo + ", ownerName=" + ownerName + ", engineNo=" + engineNo + ", color=" + color
				+ ", model=" + model + ", vendor=" + vendor + ", engineCC=" + engineCC + ", idleSpeed=" + idleSpeed
				+ ", idleMilage=" + idleMilage + ", fuelTankCapacity=" + fuelTankCapacity + "]";
	}

}
