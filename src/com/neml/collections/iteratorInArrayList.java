package com.neml.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorInArrayList {
	
	public static void main(String[] args) {
	
	ArrayList<String> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Swift");
    
    Iterator<String> iterate = languages.iterator();
    
    while(iterate.hasNext()) {    	
    	System.out.println(iterate.next());  
       }
    }
}
