package com.ques4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Player Details: ");
		String playerDetails=sc.nextLine();
		String[]playerArr=playerDetails.split(",");
		Player player=new Player();
		player.setName(playerArr[0]);
		player.setCountry(playerArr[1]);
		player.setSkill(playerArr[2]);
		System.out.println("Player Details: ");
		System.out.println("Player Name: "+player.getName());
		System.out.println("Player Country: "+player.getCountry());
		System.out.println("Player Skill: "+player.getSkill());


	}

}
