package com.day7.ques1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Player> players=new ArrayList<>();
		System.out.println("Enter the number of players: ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the details: ");
		for(int i=0;i<n;i++) {
			System.out.println("Name: ");
			String name=sc.nextLine();
			System.out.println("Skill: ");
			String skill=sc.nextLine();
			System.out.println("Cap Number: ");
			Long capNumber=sc.nextLong();
			sc.nextLine();
			Player player=new Player(name,skill,capNumber);
			players.add(player);
		}
		Collections.sort(players);
		for(Player p:players) {
			System.out.println(p);
		}

	}

}
