package com.ques3;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Over: ");
		Long over=sc.nextLong();
		System.out.println("Enter the number of Balls: ");
		Long balls=sc.nextLong();
		System.out.println("Enter the Runs: ");
		Long runs=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Batsman Name: ");
		String batsman=sc.nextLine();
		System.out.println("Enter the Bowler: ");
		String bowler=sc.nextLine();
		System.out.println("Enter the Non-Striker: ");
		String nonStriker=sc.nextLine();
		
		Delivery delivery=new Delivery();
		delivery.setOver(over);
		delivery.setBalls(balls);
		delivery.setRuns(runs);
		delivery.setBatsman(batsman);
		delivery.setBowler(bowler);
		delivery.setNonStricker(nonStriker);
		
		System.out.println("Delivery Details: ");
		System.out.println("Over :"+delivery.getOver());
		System.out.println("Balls :"+delivery.getBalls());
		System.out.println("Runs :"+delivery.getRuns());
		System.out.println("Batsman :"+delivery.getBatsman());
		System.out.println("Bowler :"+delivery.getBowler());
		System.out.println("Non-Striker :"+delivery.getNonStricker());
	}

}
