package com.ques1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		Venue venue=new Venue();
		// TODO Auto-generated method stub
		System.out.println("Enter the Name: ");
		venue.setName(sc.nextLine());
		System.out.println("Enter the City: ");
		venue.setCity(sc.nextLine());
		VenueBO.displayVenueDetails(venue);

	}

}
