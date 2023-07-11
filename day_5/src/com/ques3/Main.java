package com.ques3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String validTeams="CSK,MI,KKR,DD,KXIP,RR";
		
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter winner Team: ");
		String winner=sc.nextLine();
		if((!validTeams.contains(winner))) {
			throw new TeamNotFoundException("Invalid Team");
		}
		System.out.println("Enter Runner: ");
		String runner=sc.nextLine();
		if((!validTeams.contains(runner))) {
			throw new TeamNotFoundException("Invalid Team");
		}
		}catch(TeamNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
