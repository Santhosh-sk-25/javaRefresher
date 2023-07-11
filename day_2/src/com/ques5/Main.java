package com.ques5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Venue venue=new Venue();
		
		System.out.println("Enter the Venue name: ");
		String name=sc.nextLine();
		System.out.println("Enter the city name: ");
		String city=sc.nextLine();
		venue.setName(name);
		venue.setCity(city);
		System.out.println("Venue Details: ");
		System.out.println("Venue Name: "+venue.getName());
		System.out.println("Venue City: "+venue.getCity());
		while (true) {
			System.out.println("Menu\n1.Update Venue Name\n2.Update City Name\n3.No Correction/Exit\nType 1 or 2 or 3");
			int menu=sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:{
				System.out.println("Enter the Venue Name: ");
				venue.setName(sc.nextLine());
				System.out.println("Venue Details: ");
				System.out.println("Venue Name: "+venue.getName());
				System.out.println("Venue City: "+venue.getCity());
				break;
				
			}
			case 2:{
				System.out.println("Enter the City Name: ");
				venue.setCity(sc.nextLine());
				System.out.println("Venue Details: ");
				System.out.println("Venue Name: "+venue.getName());
				System.out.println("Venue City: "+venue.getCity());
				break;
			}
			case 3:{
				System.exit(0);
			}
			}
		}
		
		
		

	}

}
