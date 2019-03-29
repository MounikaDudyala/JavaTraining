package com.imaginea.javaTraining;

public class Employee extends Person {

	String CompanyName;
	public Employee(String Name, int age, GENDER gender,String CompanyName) {
		super(Name, age, gender);
		this.CompanyName=CompanyName;
	}
	public String getCompanyName()
	{
		return CompanyName;
	}
	public void print()
	{
		System.out.println("company name is"+this.getCompanyName());
	}
	

}
