package com.day7.ques4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.day7.ques3.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Integer,Player>players=new TreeMap<>();	
		System.out.println("Enter the number of Players: ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("CapNumber: ");
			int cap=sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name=sc.nextLine();
			System.out.println("Skill: ");
			String skill=sc.nextLine();
			System.out.println("Team: ");
			String team=sc.nextLine();
			Player p=new Player(name,skill,team);
			players.put(cap,p);
			
		}
		System.out.println("Enter the cap number: ");
		int search=sc.nextInt();
		System.out.println(search+"--"+players.get(search));

	}

}
