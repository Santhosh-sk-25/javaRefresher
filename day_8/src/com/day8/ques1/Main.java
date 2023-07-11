package com.day8.ques1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] dhoniArr=new int[5];
		int[] othersArr=new int[5];
		int[]res=new int[5];
		int sum=0;
		for (int i=0;i<5;i++) {
			dhoniArr[i]=sc.nextInt();
			sc.nextLine();
		}
		for(int i=0;i<5;i++) {
			othersArr[i]=sc.nextInt();
			sc.nextLine();
		}
		
		for (int i=0;i<5 ;i++) {
			res[i]=dhoniArr[i]-othersArr[i];
			if(res[i]>=4)
				sum+=1;
		}
		System.out.println(sum);

	}

}
