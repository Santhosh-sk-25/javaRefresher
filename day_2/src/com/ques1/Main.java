package com.ques1;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		System.out.println("Enter the Venue Name: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Enter the City Name: ");
		String city=sc.nextLine();
		Venue venue=new Venue();
		venue.setName(name);
		venue.setCity(city);
		System.out.println("Venue Details: ");
		System.out.println("Venue Name: "+venue.getName());
		System.out.println("Venue City: "+venue.getCity());
	}

}
