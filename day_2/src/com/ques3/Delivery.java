package com.ques3;

public class Delivery {
	
	Long over;
	Long balls;
	Long runs;
	String batsman;
	String bowler;
	String nonStricker;
	public Delivery() {
		super();
	}
	public Delivery(Long over, Long balls, Long runs, String batsman, String bowler, String nonStricker) {
		super();
		this.over = over;
		this.balls = balls;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStricker = nonStricker;
	}
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBalls() {
		return balls;
	}
	public void setBalls(Long balls) {
		this.balls = balls;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStricker() {
		return nonStricker;
	}
	public void setNonStricker(String nonStricker) {
		this.nonStricker = nonStricker;
	}
	
	

}
