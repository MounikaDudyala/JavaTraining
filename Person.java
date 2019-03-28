package com.imaginea.javaTraining;

public class Person {
	public static String MALE="m";
	public static String FEMALE="f";
	private String Name;
	private int age;
	private String gender;
	public Person(String Name,int age,String gender)
	{
		this.Name=Name;
		this.age=age;
		this.gender=gender;
	}
	public boolean isageValidToVote()
	{
		return isValidAge(age, AdministrationDepartment.MIN_AGE_TO_Vote);
	}
	public boolean isageValidToDrive()
	{
		return isValidAge(age, AdministrationDepartment.MIN_AGE_TO_Drive);
	}
	public boolean isageValidToGetMarried()
	{
		return (isMale()&&isValidAge(age,AdministrationDepartment.MIN_AGE_TO_Get_Married_For_Boy))||(isFemale()&&isValidAge(age,AdministrationDepartment.MIN_AGE_TO_Get_Married_For_Girl));
	}
	public boolean isMale()
	{
		return isTwoStringsEqual(gender,"m");
	}
	public boolean isFemale()
	{
		return isTwoStringsEqual(gender,"f");
	}
	public boolean isTwoStringsEqual(String first,String second)
	{
		return first.equals(second);
	}
	public boolean isValidAge(int person_age,int min_age )
	{
		return person_age>=min_age;
	}
	public String getName()
	{
		return Name;
	}
	public static void Print(Person person)
	{  
		System.out.println(person.getName()+" age is valid to vote:"+person.isageValidToVote());
		System.out.println(person.getName()+" age is valid to Drive:"+person.isageValidToDrive());
		System.out.println(person.getName()+" age is valid to GetMarried:"+person.isageValidToGetMarried());
		
		
	}
	

}
