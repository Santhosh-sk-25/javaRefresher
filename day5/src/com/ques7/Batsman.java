package com.ques7;

public class Batsman extends CricketPlayer implements IPlayerStatistics {
	
	private int runs;

	public Batsman() {
		super();
	}

	public Batsman(int runs) {
		super();
		this.runs = runs;
	}

	public Batsman(String name,String teamName,int runs) {
		super(name,teamName);
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	@Override
	public void displayPlayerData() {
		System.out.println("Name: "+super.getName());
		System.out.println("Team: "+super.getTeamName());
		System.out.println("Runs: "+this.runs);
	}
	
	
	

}
