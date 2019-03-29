package com.imaginea.javaTraining;

public class AdministrationDepartment {
	public static int MIN_AGE_TO_Vote=18;
	public static int MIN_AGE_TO_Drive=21;
	public static int MIN_AGE_TO_Get_Married_For_Girl=18;
	public static int MIN_AGE_TO_Get_Married_For_Boy=21;
	public static void main(String args[])
	{
		Person srinu=new Person("srinu",23,GENDER.MALE);
		Employee meena=new Employee("meena",10,GENDER.FEMALE,"pramati");
		Person mounika=new Person("mounika",20,GENDER.FEMALE);
		Person teju=new Person("teju",21,GENDER.FEMALE);
		Person rishi=new Person("rishi",16,GENDER.FEMALE);
		Person vamshi=new Person("vamshi",18,GENDER.MALE);
         srinu.print();
         meena.print();
         teju.print();
         rishi.print();
         mounika.print();
         vamshi.print();
           
	}
	
}
