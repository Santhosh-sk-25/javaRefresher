package com.ques6;

public class Player implements IPlayerStatistics {
	
	private String name;
	private String teamName;
	private int noOfMatches;
	private Long runsScored;
	private int noOfWickets;
	public Player() {
		super();
	}
	public Player(String name, String teamName, int noOfMatches, Long runsScored, int noOfWickets) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
		this.runsScored = runsScored;
		this.noOfWickets = noOfWickets;
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
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public Long getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(Long runsScored) {
		this.runsScored = runsScored;
	}
	public int getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	@Override
	public void displayPlayerStatistics() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+this.name);
		System.out.println("Team: "+this.teamName);
		System.out.println("No of matches Played: "+this.noOfMatches);
		System.out.println("Runs scored: "+this.runsScored);
		System.out.println("Wickets Taken: "+this.noOfWickets);
		
		
	}
	
	
	

}
