package com.ques7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String cntnu="Yes";
		
		while(cntnu.equalsIgnoreCase("YES")) {
			System.out.println("1.Bowler\n2.Batsman\n3.Wicket Keeper\n4.All Rounder");
			int ip=sc.nextInt();
			sc.nextLine();
			switch(ip) {
			
			
			case 1:{
				System.out.println("Enter Player Details: ");
				System.out.println("Enter Name: ");
				String name=sc.nextLine();
				System.out.println("Enter Team name: ");
				String team=sc.nextLine();
				System.out.println("Number of Wickets: ");
				int wickets=sc.nextInt();
				sc.nextLine();
				CricketPlayer player=new Bowler(name,team,wickets);
				player.displayPlayerData();
				break;
				
			}
			case 2:{
				System.out.println("Enter Player Details: ");
				System.out.println("Enter Name: ");
				String name=sc.nextLine();
				System.out.println("Enter Team name: ");
				String team=sc.nextLine();
				System.out.println("Number of Runs: ");
				int runs=sc.nextInt();
				sc.nextLine();
				CricketPlayer player=new Batsman(name,team,runs);
				player.displayPlayerData();
				break;
				
			}
			case 3:{
				System.out.println("Enter Player Details: ");
				System.out.println("Enter Name: ");
				String name=sc.nextLine();
				System.out.println("Enter Team name: ");
				String team=sc.nextLine();
				System.out.println("Number of catches: ");
				int catches=sc.nextInt();
				System.out.println("Number of dismissals: ");
				int dismissals=sc.nextInt();
				System.out.println("Number of Runs: ");
				int runs=sc.nextInt();
				System.out.println("Number of Stumpings: ");
				int stumpings=sc.nextInt();
				sc.nextLine();
				CricketPlayer player=new WicketKeeper(name,team,catches,dismissals,runs,stumpings);
				player.displayPlayerData();
				break;
				
			}
			
			case 4:{
				System.out.println("Enter Player Details: ");
				System.out.println("Enter Name: ");
				String name=sc.nextLine();
				System.out.println("Enter Team name: ");
				String team=sc.nextLine();
				System.out.println("Number of Wickets: ");
				int wickets=sc.nextInt();
				System.out.println("Enter number of Runs: ");
				int runs=sc.nextInt();
				sc.nextLine();
				CricketPlayer player=new AllRounder(name,team,runs,wickets);
				player.displayPlayerData();
				break;
				
			}
			}
			System.out.println("Do you wanna continue?");
			cntnu=sc.nextLine();
			
			
		}

	}

}
