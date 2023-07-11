package com.ques5;

public class FourWheeler extends Vehicle {
	
	private String audioSystem;
	private int numberOfDoors;
	public FourWheeler() {
		super();
	}
	public FourWheeler(String audioSystem, int numberOfDoors) {
		super();
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	
	public FourWheeler(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc,String audioSystem, int numberOfDoors) {
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	@Override
	public void detailInfo() {
		System.out.println("-----Detailed Info-----");
		System.out.println("Audio System: "+this.audioSystem);
		System.out.println("No. of Doors: "+this.numberOfDoors);
	}
	

}
