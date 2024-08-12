package com.neml.practice;

import java.util.Arrays;
import java.util.HashSet;

public class SameElementsPresentInArrays {

	public static void main(String[] args) {

		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		HashSet<Integer> as1 = new HashSet<>(Arrays.asList(a1));
		HashSet<Integer> as2 = new HashSet<>(Arrays.asList(a1));
		HashSet<Integer> as3 = new HashSet<>(Arrays.asList(a1));
		
		boolean result = as1.containsAll(as3);
		System.out.println(result);

	}

}
