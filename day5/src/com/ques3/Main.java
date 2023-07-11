package com.ques3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code: ");
		String code=sc.nextLine();
		System.out.println((UserMain.validTeam(code))?"Valid":"Invalid");

	}

}
