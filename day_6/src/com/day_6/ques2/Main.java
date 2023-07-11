package com.day_6.ques2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> homeRuns=new ArrayList<>();
		List<Integer> awayRuns=new ArrayList<>();
		List<Integer> highScores=new ArrayList<>();
		System.out.println("Enter team Name: ");
		String name=sc.nextLine();
		System.out.println("Enter the number of home runs: ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Home runs: ");
		for(int i=0;i<n;i++) {
			int homeRun=sc.nextInt();
			sc.nextLine();
			homeRuns.add(homeRun);
		}
		System.out.println("Enter the number of Away Matches: ");
		int m=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Home runs: ");
		for(int i=0;i<m;i++) {
			int awayRun=sc.nextInt();
			sc.nextLine();
			awayRuns.add(awayRun);
		}
		System.out.println("Runs Scored by "+name+": ");
		for(int i:homeRuns) {
			System.out.println(i);
			if(i>=300) {
				highScores.add(i);
			}
		}
		for(int j:awayRuns) {
			System.out.println(j);
			if(j>=300) {
				highScores.add(j);
			}
		}
		System.out.println("Runs Greater than 300: ");
		for(int k: highScores) {
			System.out.println(k);
		}
		

	}

}
