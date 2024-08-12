package com.neml.practice;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,5};
		int n = arr.length+1;
		int num=(n*(n+1))/2;
		int missingNum = getMissingNumber(arr,num);
		System.out.println(missingNum);

	}

	private static int getMissingNumber(int[] arr, int num) {
		
		int sum = 0;
		int missingNum = 0;
		Arrays.sort(arr);
		for(int i : arr) {
			sum = sum + i;
		}
		missingNum = num - sum;
		return missingNum;
	}

}
