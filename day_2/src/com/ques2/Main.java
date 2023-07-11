package com.ques2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player Name: ");
		String name=sc.nextLine();
		System.out.println("Enter the Player Country: ");
		String country=sc.nextLine();
		System.out.println("Enter the Skill: ");
		String skill=sc.nextLine();
		Player player=new Player();
		player.setName(name);
		player.setCountry(country);
		player.setSkill(skill);
		System.out.println("Player Details: ");
		System.out.println("Player Name: "+player.getName());
		System.out.println("Player Country: "+player.getCountry());
		System.out.println("Player Skill: "+player.getSkill());

	}

}
