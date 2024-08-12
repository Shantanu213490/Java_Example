package com.neml.java;

import java.util.HashSet;
import java.util.Iterator;

public class ForExample {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		
		hs.add("abc");
		hs.add("def");
		hs.add("ghi");	
		hs.add("jkl");
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
