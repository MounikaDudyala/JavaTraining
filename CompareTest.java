package com.imaginea.javatraining.compare;
import java.util.List;
import java.util.ArrayList;


public class CompareTest {
	
public static void main(String args[])
{
	List<String> data=new ArrayList<>();
	try {
	int a=40;
	int b=a/0;
	int c[]= {1};
	c[20]=32;
	}
	catch(ArithmeticException e)
	{
		System.out.println("arithmetic exception");
	}
	catch(ArrayIndexOutOfBoundsException d)
	{
		System.out.println("Index exception");
	}
	System.out.println("out of catch");
}
}
