package com.ques5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Two Wheeler\n2.Four Wheeler");
		int menu=sc.nextInt();
		sc.nextLine();
		switch(menu) {
		case 1:{
			System.out.println("Vehcile Make: ");
			String make=sc.nextLine();
			System.out.println("Vehicle Number: ");
			String number=sc.nextLine();
			System.out.println("Fuel type: ");
			System.out.println("1.Petrol\n2.Diesel");
			int type=sc.nextInt();
			sc.nextLine();
			String fuelType=(type==1)?"Petrol":"Diesel";
			System.out.println("Fuel Capacity: ");
			int capacity=sc.nextInt();
			System.out.println("Engine CC: ");
			int cc=sc.nextInt();
			System.out.println("KickStarter Available: ");
			boolean kick=sc.nextBoolean();
			sc.nextLine();
			Vehicle vehicle=new TwoWheeler(make,number,fuelType,capacity,cc,kick);
			vehicle.displayBasicDetails();
			System.out.println();
			vehicle.detailInfo();
			break;
		}
		case 2:{
			System.out.println("Vehcile Make: ");
			String make=sc.nextLine();
			System.out.println("Vehicle Number: ");
			String number=sc.nextLine();
			System.out.println("Fuel type: ");
			System.out.println("1.Petrol\n2.Diesel");
			int type=sc.nextInt();
			sc.nextLine();
			String fuelType=(type==1)?"Petrol":"Diesel";
			System.out.println("Fuel Capacity: ");
			int capacity=sc.nextInt();
			System.out.println("Engine CC: ");
			int cc=sc.nextInt();
			System.out.println("Audio System: ");
			String audio=sc.nextLine();
			System.out.println("Number of doors: ");
			int doors=sc.nextInt();
			Vehicle vehicle=new FourWheeler(make,number,fuelType,capacity,cc,audio,doors);
			vehicle.displayBasicDetails();
			System.out.println();
			vehicle.detailInfo();
			break;
			
		}
		}

	}

}
