package com.neml.java;

public class FibonaciiSeries {

	public static void main(String[] args) {
		
		int n=5;
		int[] result = GetFibonaciSeries.Series(n);
		
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}

}
class GetFibonaciSeries {

    static int[] Series(int n) {
    	
    	
    	       int[] fibonacciSeries = new int[n+1];
    	        if (n+1 >= 1) {
    	            fibonacciSeries[0] = 0;
    	        }
    	        if (n+1 >= 2) {
    	            fibonacciSeries[1] = 1;
    	        }
    	        for (int i = 2; n+1>i; i++) {
    	            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
    	        }
    	        return fibonacciSeries;
    	    }
       
    }
