package com.ques7;

public class AllRounder extends CricketPlayer implements IPlayerStatistics {
	
	private int runs;
	private int noOfWickets;
	public AllRounder() {
		super();
	}
	public AllRounder(int runs, int noOfWickets) {
		super();
		this.runs = runs;
		this.noOfWickets = noOfWickets;
	}
	public AllRounder(String name,String teamName,int runs, int noOfWickets) {
		super(name,teamName);
		this.runs = runs;
		this.noOfWickets = noOfWickets;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	
	@Override
	public void displayPlayerData() {
		System.out.println("Name: "+super.getName());
		System.out.println("Team: "+super.getTeamName());
		System.out.println("Runs: "+this.runs);
		System.out.println("No Of Wickets: "+this.noOfWickets);
	}
	

}
