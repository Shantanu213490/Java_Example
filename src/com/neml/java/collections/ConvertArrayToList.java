package com.neml.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
	
		int[] arr = new int[] {1,4,8,3,9};
		
		
		
		List<Integer> ls = new ArrayList<>();
				
		for(int i=0;i<arr.length;i++) {
			
			ls.add(arr[i]);
		}
		
		System.out.println(ls);
		
		Object[] arr1 = ls.toArray();  
	}
	

	

}
