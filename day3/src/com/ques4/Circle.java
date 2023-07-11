package com.ques4;

public class Circle extends Shape {
	private int radius;

	public Circle() {
		super();
		
	}

	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return 3.14*(this.radius*this.radius);
	}
	
	

}
