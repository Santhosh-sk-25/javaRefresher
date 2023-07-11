package com.ques7;

public class CricketPlayer implements IPlayerStatistics {
	
	private String name;
	private String teamName;
	public CricketPlayer() {
		super();
	}
	public CricketPlayer(String name, String teamName) {
		super();
		this.name = name;
		this.teamName = teamName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	@Override
	public void displayPlayerData() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+this.name);
		System.out.println("Team: "+this.teamName);
		
		
	}
	
	

}
