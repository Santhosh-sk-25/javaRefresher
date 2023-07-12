package com.day_9.ques3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="santhoshsk@gmail.com";
		String password="Sk@anonymous12";
		PasswordAuthenticator pwd=(String name,String pass)->{
			if(name.contains("@gmail.com") && pass.length()>=8) {
				return true;
			}
			else {
				return false;
			}
		};
		
		System.out.println(pwd.authenticate(userName, password));

	}

}
