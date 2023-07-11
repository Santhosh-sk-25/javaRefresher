package com.ques6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Player Details: ");
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Team Name: ");
		String team=sc.nextLine();
		System.out.println("Enter Matches Played: ");
		int matches=sc.nextInt();
		System.out.println("Enter Runs Scored: ");
		long runs=sc.nextLong();
		System.out.println("Enter Wickets Taken: ");
		int wickets=sc.nextInt();
		sc.nextLine();
		Player player=new Player(name,team,matches,runs,wickets);
		System.out.println("Player Details: ");
		player.displayPlayerStatistics();
		

	}

}
