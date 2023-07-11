package com.day7.ques2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Team> teams=new ArrayList<>();
		System.out.println("Enter the number of teams: ");
		int n=sc.nextInt();
		sc.nextLine();
		for (int i=0;i<n;i++) {
			System.out.println("Name: ");
			String name=sc.nextLine();
			System.out.println("No. Of Matches: ");
			Long noOfMatches=sc.nextLong();
			sc.nextLine();
			Team team=new Team(name,noOfMatches);
			teams.add(team);
		}
		Collections.sort(teams,new TeamComparator());
		System.out.println("After Sorting: ");
		for(Team t: teams) {
			System.out.println(t);
		}

	}

}
