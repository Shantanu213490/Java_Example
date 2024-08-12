package com.neml.practice;

public class SecondLargestElementInArray {

	public static void main(String[] args) {

		  int[] array = {10, 5, 20, 8, 12, 15};
		  int result = getSecondLargestElement(array);
		  System.out.println(result);
		

	}

	private static int getSecondLargestElement(int[] array) {
		
//		int largest = Integer.MIN_VALUE;
//		int secondLargest = Integer.MIN_VALUE;
//		
//		if(array != null && array.length > 2) {
//			
//			for(int num : array) {
//				 
//				if(num > largest) {
//					secondLargest = largest;
//					largest = num;
//				}else if(num < largest && secondLargest < num) {
//					
//					secondLargest = num;
//				}
//			}
//		}
//		return secondLargest;
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		if(array != null && array.length > 2) {
			
			for(int num : array) {
				
				if(num < smallest) {
					
					secondSmallest = smallest;
					smallest = num;
					
				}else if(num < secondSmallest && num > smallest) {
					 secondSmallest = num;
				}
				
			}
		}
		return secondSmallest;
	}

}
