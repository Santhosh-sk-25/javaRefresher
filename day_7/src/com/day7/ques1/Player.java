package com.day7.ques1;

public class Player implements Comparable<Player>{
	
	private String name;
	private String skill;
	private Long capNumber;
	public Player() {
		super();
	}
	public Player(String name, String skill, Long capNumber) {
		super();
		this.name = name;
		this.skill = skill;
		this.capNumber = capNumber;
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
	public Long getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(Long capNumber) {
		this.capNumber = capNumber;
	}
	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		int result=0;
		
		if(this.capNumber>o.getCapNumber()) {
			result=-1;
		}
		else if(this.capNumber<o.getCapNumber()) {
			result=1;
		}
		else {
			result=0;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.skill+"-"+this.capNumber;
	}
	
	

}
