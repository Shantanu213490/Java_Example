package com.neml.gfgjava;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int[] array = {1};
		int n = 2;
		
		int result = GetMissingNumber.missingNumber(array,n);
		System.out.println(result);
	}

}

class GetMissingNumber {
	public static int missingNumber(int array[], int n) {
		
		int missNum=0,sum=0;
		int num=(n*(n+1))/2;
		Arrays.sort(array);		 
		for(int i=0;i<n-1;i++) {			
			sum = sum+array[i];
		}
		missNum = num - sum ;
		return missNum;

	}
}

//Example 1:
//
//Input:
//N = 5
//A[] = {1,2,3,5}
//Output: 4

//Example 2:
//
//Input:
//N = 10
//A[] = {6,1,2,8,3,4,7,10,5}
//Output: 9