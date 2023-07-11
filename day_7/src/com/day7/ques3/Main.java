package com.day7.ques3;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
		System.out.println("Player Details: ");
		for(Map.Entry<Integer,Player> entry:players.entrySet()) {
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}

	}

}
