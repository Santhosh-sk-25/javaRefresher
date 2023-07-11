package com.ques5;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Circle\nSquare\nRectangle");
		System.out.println("Enter the shape name: ");
		String shape=sc.nextLine();
		switch(shape) {
		case "Circle":{
			System.out.println("Enter radius: ");
			int radius=sc.nextInt();
			Shape circle=new Circle(shape,radius);
			System.out.println("Area of Circle: "+circle.calculateArea());
			break;
		}
		
		case "Square":{
			System.out.println("Enter side: ");
			int side=sc.nextInt();
			Shape square=new Square(shape,side);
			System.out.println("Area of Circle: "+square.calculateArea());
			break;
		}
		
		case "Rectangle":{
			System.out.println("Enter length: ");
			int length=sc.nextInt();
			System.out.println("Enter breadth: ");
			int breadth=sc.nextInt();
			Shape rect=new Rectangle(shape,length,breadth);
			System.out.println("Area of Circle: "+rect.calculateArea());
			break;
		}
				
		}
	}

}
