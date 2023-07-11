package com.ques1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team details with # separated: ");
		String ip=sc.nextLine();
		String[] arr=ip.split("#");
		Team team=new Team(arr[0],arr[1],arr[2],arr[3],arr[4]);
		System.out.println("Team Details: ");
		System.out.println("Name: "+team.getName());
		System.out.println("Coach: "+team.getCoach());
		System.out.println("Players: "+team.getPlayers());
		System.out.println("Location: "+team.getLocation());
		System.out.println("Captain: "+team.getCaptain());
		

	}

}
