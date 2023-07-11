package com.ques1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter number of overs: ");
			int size=sc.nextInt();
			sc.nextLine();
			int[] runs=new int[size];
			System.out.println("Enter the runs of "+size+" over: ");
			for (int i=0;i<size;i++) {
				runs[i]=sc.nextInt();
				sc.nextLine();
			}
			System.out.println("Enter the over: ");
			int over=sc.nextInt();
			System.out.println(runs[over-1]);
		}
		catch(ArrayIndexOutOfBoundsException  | NegativeArraySizeException ex) {
			System.out.println(ex.getClass());
		}

	}

}
