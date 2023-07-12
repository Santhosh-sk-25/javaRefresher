package com.day_9.ques4;

public class Employee {
	private String name;
	private String code;
	public Employee(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		System.out.println(this.name+" "+this.code);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

	

}
