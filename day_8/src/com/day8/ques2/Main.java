package com.day8.ques2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		sc.nextLine();
		if(n<0) {
			System.err.println("Invalid input");
			System.exit(0);
		}
		int[] dhoniArr=new int[n];
		for(int i=0;i<n;i++) {
			dhoniArr[i]=sc.nextInt();
			sc.nextLine();
			if(dhoniArr[i]<0) {
				System.err.println("Invalid input");
				System.exit(0);
			}
		}
		for(int i=0;i<n-1;i++) {
			if((dhoniArr[i+1]-dhoniArr[i])>0) {
				sum+=1;
			}
		}
		//System.out.println(sum);
		if(sum==(dhoniArr.length-1)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
