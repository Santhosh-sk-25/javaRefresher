package com.ques3;

public class UserMain {
	
	static String teams= "RCB,CSK,MI,SRH,KKR,GT,KXLP,DD,RPSG";
	
	public static boolean validTeam(String data) {
		String result[]=data.split(",");
		boolean ret=false;
		if(teams.contains(result[0]) &&(result[1].matches("[0-9]+"))) {
			ret=true;
		}
		return ret;
	}

}
