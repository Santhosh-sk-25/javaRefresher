package com.ques1;

public class Team {
	
	private String name;
	private String coach;
	private String players;
	private String location;
	private String captain;
	public Team() {
		super();
	}
	public Team(String name, String coach, String players, String location, String captain) {
		super();
		this.name = name;
		this.coach = coach;
		this.players = players;
		this.location = location;
		this.captain = captain;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getPlayers() {
		return players;
	}
	public void setPlayers(String players) {
		this.players = players;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	
	

}
