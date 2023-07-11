package com.ques3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Player Details: ");
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter the Country: ");
		String country=sc.nextLine();
		System.out.println("Enter the skill: ");
		String skill=sc.nextLine();
		System.out.println("Enter the Cap Number: ");
		String capNumber=sc.nextLine();
		System.out.println("Enter the Test Appearances: ");
		Long testAppear=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the ODI Appearance: ");
		Long odiAppear=sc.nextLong();
		InternationalPlayer player=new InternationalPlayer(name,country,skill,capNumber,testAppear,odiAppear);
		System.out.println("Player Details: ");
		System.out.println("Name: "+player.getName());
		System.out.println("Country: "+player.getCountry());
		System.out.println("Skill: "+player.getSkill());
		System.out.println("Cap Number: "+player.getCapNumber());
		System.out.println("Test Appearances: "+player.getNoOfTestAppearance());
		System.out.println("ODI Appearances: "+player.getNoOfODIAppearance());
		

	}

}
