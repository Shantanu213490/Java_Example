package com.neml.java.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExamples {

	public static void main(String[] args) {
		
		
		List<Integer> ls = Arrays.asList(2,7,3,8,1,5,4,6,9);
		
		System.out.println(ls);
		
		System.out.println("after sorting ....");
		Collections.sort(ls,Comparator.reverseOrder());
		System.out.println(ls);
	}

}
