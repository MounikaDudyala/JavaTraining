package com.imaginea.javaTraining;

public class AdministrationDepartment {
	public static int MIN_AGE_TO_Vote=18;
	public static int MIN_AGE_TO_Drive=21;
	public static int MIN_AGE_TO_Get_Married_For_Girl=18;
	public static int MIN_AGE_TO_Get_Married_For_Boy=21;
	public static void main(String args[])
	{
		Person srinu=new Person("srinu",23,Person.MALE);
		Employee employee2=new Employee("meena",10,Person.FEMALE,"pramati");
		Person person3=new Person("mounika",20,Person.FEMALE);
		Person person4=new Person("teju",21,Person.FEMALE);
		Person person5=new Person("rishi",16,Person.FEMALE);
		Person person6=new Person("vamshi",18,Person.MALE);
          Person.Print(srinu);
          Person.Print(employee2);
          employee2.getCompanyName();
          Person.Print(person3);
          Person.Print(person4);
          Person.Print(person5);
          Person.Print(person6);
           
	}
	
		// TODO Auto-generated method stub
		
	
}
