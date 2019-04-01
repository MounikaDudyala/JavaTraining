package com.imaginea.javatraining.generics;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class GenericsMain {
 public static void main(String args[])
 {  GenericsSample<String,Integer> obj1=new GenericsSample<String,Integer>("hai java training stats on march",3);
     GenericsSample<Integer,String> obj2=new GenericsSample<Integer,String>(10,"Am");
     obj1.display();
     obj2.display();
     
 }
}
