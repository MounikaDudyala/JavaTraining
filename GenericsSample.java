package com.imaginea.javatraining.generics;

 class GenericsSample<T,V>{
	 T element1;
	 V element2;
	GenericsSample(T value1,V value2)
	{
		element1=value1;
		element2=value2;
	}
    void display()
    {
    	System.out.println(element1+""+element2);
    	
    }
}
