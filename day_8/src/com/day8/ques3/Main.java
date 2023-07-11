package com.day8.ques3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int prev=0;
		sc.nextLine();
		if(n<0) {
			System.err.println("Invalid input");
			System.exit(0);
		}
		int[] rates=new int[n];
		for(int i=0;i<n;i++) {
			rates[i]=sc.nextInt();
			sc.nextLine();
		}
		for(int i=0;i<n;i++) {
			if(rates[i]>prev) {
				sum+=1;
			}
			else {
				sum-=1;
			}
			prev=rates[i];
		}
		System.out.println(sum);

	}

}
