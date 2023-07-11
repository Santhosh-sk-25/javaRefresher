package com.ques2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players: ");
		int len=sc.nextInt();
		sc.nextLine();
		Player[] playerArr=new Player[len];
		for (int i=0;i<len;i++) {
			System.out.println("Enter the name: ");
			String name=sc.nextLine();
			System.out.println("Enter the country: ");
			String country=sc.nextLine();
			System.out.println("Enter the skill: ");
			String skill=sc.nextLine();
			playerArr[i]=new Player(name,country,skill);	
		}
		PlayerBO.displayPlayerDetails(playerArr);

	}

}
