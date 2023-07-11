package com.ques2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Wicket> wicketList=new ArrayList<>();
		System.out.println("Enter the number of wickets: ");
		int num=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<num;i++) {
			System.out.println("Enter the Details of Wicket "+(i+1)+": ");
			String wick=sc.nextLine();
			String [] arr=wick.split(",");
			Long over=Long.parseLong(arr[0]);
			Long ball=Long.parseLong(arr[1]);
			Wicket wicket=new Wicket(over,ball,arr[2],arr[3],arr[4]);
			wicketList.add(wicket);
		}
		System.out.println("Wicket Details: ");
		for(Wicket wick:wicketList) {
			System.out.println("Over: "+wick.getOcer());
			System.out.println("Ball: "+wick.getBall());
			System.out.println("WicketType: "+wick.getWicketType());
			System.out.println("Player: "+wick.getPlayerName());
			System.out.println("Bowler: "+wick.getBowlerName());
		}

	}

}
