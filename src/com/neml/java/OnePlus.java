package com.neml.java;

public class OnePlus {
	
	public static void main(String[] args) {
		
		int[] digits = {9};
		int[] result = plusOne(digits);
		System.out.print("[");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
	        if (i < result.length - 1) {
	            System.out.print(",");
	        }
		}
		System.out.print("]");
	}
	public static int[] plusOne(int[] digits) {
		
		 int len = digits.length-1;
		 digits[len]=digits[len]+1;
		 int[] destinationArray = new int[digits.length];
		    
		    for (int i = 0; i < digits.length; i++) {
		        destinationArray[i] = digits[i];
		    }
		return destinationArray;
        
    }

}
