package com.ques5;

public class Circle extends Shape {
	
	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return (float)(3.14*(this.radius*this.radius));
	}
	
	

}
