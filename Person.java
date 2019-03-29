package com.imaginea.javaTraining;

public class Person {
	private String Name;
	private int age;
	private GENDER gender;
	public Person(String Name,int age,GENDER gender)
	{
		this.Name=Name;
		this.age=age;
		this.gender=gender;
	}
	public boolean isageValidToVote()
	{
		return isfirstint_greater_than_secondint(age, AdministrationDepartment.MIN_AGE_TO_Vote);
	}
	public boolean isageValidToDrive()
	{
		return isfirstint_greater_than_secondint(age, AdministrationDepartment.MIN_AGE_TO_Drive);
	}
	public boolean isageValidToGetMarried()
	{
		return (isMale()&&isfirstint_greater_than_secondint(age,AdministrationDepartment.MIN_AGE_TO_Get_Married_For_Boy))||(isFemale()&&isfirstint_greater_than_secondint(age,AdministrationDepartment.MIN_AGE_TO_Get_Married_For_Girl));
	}
	public boolean isMale()
	{
		return GENDER.MALE==this.gender;
	}
	public boolean isFemale()
	{
		return GENDER.FEMALE==this.gender;
	}
	
	private boolean isfirstint_greater_than_secondint(int first,int second)
	{
		return first>=second;
	}
	public String getName()
	{ 
		return Name;
	}
	public void print()
	{  
		System.out.println(this.getName()+" age is valid to vote:"+this.isageValidToVote());
		System.out.println(this.getName()+" age is valid to Drive:"+this.isageValidToDrive());
		System.out.println(this.getName()+" age is valid to GetMarried:"+this.isageValidToGetMarried());
	}
}
