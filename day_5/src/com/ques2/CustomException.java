package com.ques2;

public class CustomException extends Exception {
	
	private String message;
	
	

	public CustomException(String message) {
		super();
		this.message = message;
	}



	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	

}
