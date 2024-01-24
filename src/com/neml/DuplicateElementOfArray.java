package com.neml;

public class DuplicateElementOfArray {
	
	public static void main(String[] args) {
		
		int  arr[] = {1,2,4,7,8,2};
		sortedArray(arr);
	}
	
	static void sortedArray(int[] arr) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]!=arr[j]) {
					
					count++;
					
				}
				
			}
			System.out.println(count);
			
			
		}
		
		
	}
	

}
