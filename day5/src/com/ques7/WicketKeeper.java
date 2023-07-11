package com.ques7;

public class WicketKeeper extends CricketPlayer implements IPlayerStatistics{
	
	private int noOfCatche;
	private int noOfDismissals;
	private int runs;
	private int noOfStumpings;
	public WicketKeeper() {
		super();
	}
	public WicketKeeper(int noOfCatche, int noOfDismissals, int runs, int noOfStumpings) {
		super();
		this.noOfCatche = noOfCatche;
		this.noOfDismissals = noOfDismissals;
		this.runs = runs;
		this.noOfStumpings = noOfStumpings;
	}
	public WicketKeeper(String name,String teamName,int noOfCatche, int noOfDismissals, int runs, int noOfStumpings) {
		super(name,teamName);
		this.noOfCatche = noOfCatche;
		this.noOfDismissals = noOfDismissals;
		this.runs = runs;
		this.noOfStumpings = noOfStumpings;
	}
	public int getNoOfCatche() {
		return noOfCatche;
	}
	public void setNoOfCatche(int noOfCatche) {
		this.noOfCatche = noOfCatche;
	}
	public int getNoOfDismissals() {
		return noOfDismissals;
	}
	public void setNoOfDismissals(int noOfDismissals) {
		this.noOfDismissals = noOfDismissals;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getNoOfStumpings() {
		return noOfStumpings;
	}
	public void setNoOfStumpings(int noOfStumpings) {
		this.noOfStumpings = noOfStumpings;
	}
	
	@Override
	public void displayPlayerData() {
		System.out.println("Name: "+super.getName());
		System.out.println("Team: "+super.getTeamName());
		System.out.println("No of Catches: "+this.noOfCatche);
		System.out.println("No Of Dismissals: "+this.noOfDismissals);
		System.out.println("No Of Stumpings: "+this.noOfStumpings);
		System.out.println("Runs: "+this.runs);
	}
	
	

}
