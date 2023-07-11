package com.ques4;

public class Square extends Shape {
	
	private int side;

	public Square() {
		super();
	}

	public Square(int side) {
		super("Square");
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return this.side*this.side;
	}

}
