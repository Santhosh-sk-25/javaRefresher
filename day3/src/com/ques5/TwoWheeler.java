package com.ques5;

public class TwoWheeler extends Vehicle {
	
	private boolean kickStartAvailable;

	public TwoWheeler() {
		super();
	}

	public TwoWheeler(boolean kickStartAvailable) {
		super();
		this.kickStartAvailable = kickStartAvailable;
	}
	public TwoWheeler(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc,boolean kickStartAvailable) {
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	
	@Override
	public void detailInfo() {
		System.out.println("-----Detailed Info-----");
		System.out.println("KickStarter Available: "+((this.kickStartAvailable)?"YES":"NO"));
	}

}
