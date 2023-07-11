package com.ques4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculate Area");
		System.out.println("1.Square\n2.Rectangle\n3.Circle");
		int menu=sc.nextInt();
		sc.nextLine();
		switch(menu) {
		case 1:{
			System.out.println("Enter the Side: ");
			int side=sc.nextInt();
			sc.nextLine();
			Square sqr=new Square(side);
			System.out.println("Area of Square: "+sqr.calculateArea());
			break;
		}
		case 2:{
			System.out.println("Enter the Length: ");
			int length=sc.nextInt();
			System.out.println("Enter the Breadth: ");
			int breadth=sc.nextInt();
			sc.nextLine();
			Rectangle rec=new Rectangle(length,breadth);
			System.out.println("Area of Rectangle: "+rec.calculateArea());
			break;
		}
		case 3:{
			System.out.println("Enter the radius: ");
			int radius=sc.nextInt();
			sc.nextLine();
			Circle circle=new Circle(radius);
			System.out.println("Area of Rectangle: "+circle.calculateArea());
			break;
		}
		}

	}

}
