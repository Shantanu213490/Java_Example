package com.neml.gfgjava;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int n = 6;
		int[] arr = {12, 35, 1, 10, 34, 1};
		int result = GetSecondLargeNum.print2largest(arr, n);
		System.out.println(result);

	}

}
class GetSecondLargeNum {
   public static int print2largest(int arr[], int n) {
	      
	   int firstLargest = Integer.MIN_VALUE;
	   int secondLargest = Integer.MAX_VALUE;
	   for(int i=0;i<n-1;i++) {
		   if(arr[i]>firstLargest) {
			   secondLargest = firstLargest;
			   firstLargest = arr[i];
		   } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
               secondLargest = arr[i];
           }
	   }
	return secondLargest;
	   
    }
}