//Csk List Total and Average
package com.day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> csk=new ArrayList<>();
		int sum=0;
		System.out.println("Enter the number of matches: ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Scores: ");
		for(int i=0;i<n;i++) {
			int runs=sc.nextInt();
			sc.nextLine();
			csk.add(runs);
			sum+=runs;
			
		}
		System.out.println("Total Scores: "+sum);
		System.out.println("Average: "+sum/csk.size());
		
	}

}
