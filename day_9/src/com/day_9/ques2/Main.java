package com.day_9.ques2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="ABCDEF";
		
		String[] arr=input.split("");
		String[] output=new String[arr.length*2];
		for(int i=0;i<arr.length-1;i++) {
			output[i]=arr[i];
			output[i+1]=" ";
		}
		System.out.println(output);
		
		
	}

}
