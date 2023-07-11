package com.ques2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter player name: ");
		String name=sc.nextLine();
		System.out.println("Enter Player Age: ");
		int age=sc.nextInt();
		sc.nextLine();
		if(age>=19) {
			System.out.println("Name: "+name);
			System.out.println("Age:" +age);
			
		}
		else {
			throw new CustomException("Invalid Age");
			
		}
		
		}catch(CustomException ex){
			System.out.println(ex.getMessage());
			
		}
	}

}
