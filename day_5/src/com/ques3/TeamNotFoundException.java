package com.ques3;

public class TeamNotFoundException extends Exception{
		private String message;

		public TeamNotFoundException(String message) {
			super();
			this.message = message;
		}

		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return this.message;
		}
		
		
}
