package com.ques4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Player1: ");
		String ip=sc.nextLine();
		System.out.println("Enter player2: ");
		String ip2=sc.nextLine();
		StringBuilder player1=new StringBuilder(ip);
		StringBuilder player2=new StringBuilder(ip2);
		USerMain.display(player1.toString(), player2.toString());

	}

}
