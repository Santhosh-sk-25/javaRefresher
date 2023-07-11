package com.ques5;

public class Square extends Shape {
	
	private int side;

	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public float calculateArea() {
		
		return (float) (this.side*this.side);
	}
	
	

}
