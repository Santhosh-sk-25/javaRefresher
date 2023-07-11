package com.ques4;

public class USerMain {
	
	public static void display(String p1,String p2) {
		String[]player1=p1.split(" ");
		String[] player2=p2.split(" ");
		System.out.println((player1[1].equalsIgnoreCase(player2[1]))?"YES":"NO");
	}

}
