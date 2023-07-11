package com.day7.ques3;

public class Player {
	
	private String name;
	private String skill;
	private String team;
	public Player() {
		super();
	}
	public Player(String name, String skill, String team) {
		super();
		this.name = name;
		this.skill = skill;
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"--"+this.team+"--"+this.skill;
	}
	
	

}
