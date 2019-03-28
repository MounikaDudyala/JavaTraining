package com.imaginea.javaTraining;

public class Employee extends Person {

	String CompanyName;
	public Employee(String Name, int age, String gender,String CompanyName) {
		super(Name, age, gender);
		this.CompanyName=CompanyName;
		// TODO Auto-generated constructor stub
	}
	public String getCompanyName()
	{
		return CompanyName;
	}
	

}
