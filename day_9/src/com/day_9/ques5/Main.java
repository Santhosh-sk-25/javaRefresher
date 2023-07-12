package com.day_9.ques5;

public class Main {
	public static int calcFactorial(int num) {
		if (num==1){
			return 1;
		}
		else {
			return num* calcFactorial(num-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICalculator cal=Main::calcFactorial;
		System.out.println(cal.factorial(10));

	}

}
