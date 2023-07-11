package com.ques1;

public class Venue {
	
	private String name;
	private String city;
	public Venue() {
		super();
	}
	public Venue(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+"\nCity:  "+this.city;
	}

}
