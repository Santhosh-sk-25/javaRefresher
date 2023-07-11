package com.ques2;

public class Wicket {
	private Long ocer;
	private Long ball;
	private String wicketType;
	private String playerName;
	private String bowlerName;
	public Wicket() {
		super();
	}
	public Wicket(Long ocer, Long ball, String wicketType, String playerName, String bowlerName) {
		super();
		this.ocer = ocer;
		this.ball = ball;
		this.wicketType = wicketType;
		this.playerName = playerName;
		this.bowlerName = bowlerName;
	}
	public Long getOcer() {
		return ocer;
	}
	public void setOcer(Long ocer) {
		this.ocer = ocer;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public String getWicketType() {
		return wicketType;
	}
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	
	

}
