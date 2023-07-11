package com.ques3;

public class InternationalPlayer extends Player {
	
	private String capNumber;
	private Long noOfTestAppearance;
	private Long noOfODIAppearance;
	public InternationalPlayer() {
		super();
	}
	public InternationalPlayer(String capNumber, Long noOfTestAppearance, Long noOfODIAppearance) {
		super();
		this.capNumber = capNumber;
		this.noOfTestAppearance = noOfTestAppearance;
		this.noOfODIAppearance = noOfODIAppearance;
	}
	
	public InternationalPlayer(String name,String country,String skill,String capNumber, Long noOfTestAppearance, Long noOfODIAppearance) {
		super(name,country,skill);
		this.capNumber = capNumber;
		this.noOfTestAppearance = noOfTestAppearance;
		this.noOfODIAppearance = noOfODIAppearance;
	}
	public String getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(String capNumber) {
		this.capNumber = capNumber;
	}
	public Long getNoOfTestAppearance() {
		return noOfTestAppearance;
	}
	public void setNoOfTestAppearance(Long noOfTestAppearance) {
		this.noOfTestAppearance = noOfTestAppearance;
	}
	public Long getNoOfODIAppearance() {
		return noOfODIAppearance;
	}
	public void setNoOfODIAppearance(Long noOfODIAppearance) {
		this.noOfODIAppearance = noOfODIAppearance;
	}
	
	

}
