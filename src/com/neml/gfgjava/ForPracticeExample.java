package com.neml.gfgjava;

import java.util.ArrayList;

public class ForPracticeExample {

	public static void main(String[] args) {
		  int [] arr = new int [] {2 ,0 ,3 ,3 ,1};  
		 ArrayList<Integer> ls = new ArrayList<>();
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  {
	                    ls.add(arr[j]);
	                }
	            }  
	        }  
	        System.out.println(ls); 
	}

}
