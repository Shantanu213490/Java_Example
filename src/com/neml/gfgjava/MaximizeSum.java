package com.neml.gfgjava;

import java.util.Arrays;

public class MaximizeSum {

	public static void main(String[] args) {
		      
		int n = 5;
		int arr[] = {5, 3, 2, 4, 1};
		int result = GetSumOfMax.Maximize(arr, n);
		System.out.println(result);

	}

}
class GetSumOfMax{
    
    public static int Maximize(int arr[], int n){
    	
//    	int sum = 0,mult = 0;
//    	Arrays.sort(arr);
//    	for(int i=0;i<n;i++) {
//    		
//    		mult = arr[i] * i;
//    		sum = sum + mult;
//    	}
//		return sum;
    	
   	 Arrays.sort(arr);
     int maxElement = arr[n - 1];
     long sum = maxElement * (n - 1);
     for (int i = 0; i < n - 1; i++) {
         sum += arr[i] * i;
     }
     return (int)sum;
    }   
}

