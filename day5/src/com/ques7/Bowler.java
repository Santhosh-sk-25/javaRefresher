package com.ques7;

public class Bowler extends CricketPlayer implements IPlayerStatistics{
	
	private int noOfWickets;

	public Bowler() {
		super();
	}

	public Bowler(int noOfWickets) {
		super();
		this.noOfWickets = noOfWickets;
	}
	
	public Bowler(String name,String teamName,int noOfWickets) {
		super(name,teamName);
		this.noOfWickets = noOfWickets;
	}
	
	public int getNoOfWickets() {
		return noOfWickets;
	}

	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}

	@Override
	public void displayPlayerData() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+super.getName());
		System.out.println("Team: "+super.getTeamName());
		System.out.println("No Of Wickets: "+this.noOfWickets);
		
	}
	
	

}
