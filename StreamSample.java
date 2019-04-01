package com.imaginea.javatraining.stream;

import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Collections;

public class StreamSample {
	public static void main(String args[])
	{

	List<Integer> list1 = new ArrayList<>();
	IntStream.of(90,34,56,78,80).forEach(element -> list1.add(element));
	Collections.sort(list1);
	System.out.println(list1);
	List<String> list2 = new ArrayList<>();
	IntStream.of(90,34,56,78,80).forEach(element-> list2.add(String.valueOf(element)));
	Collections.sort(list2);
	System.out.println(list2);
	}
	
}
