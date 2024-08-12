package com.neml.practice;

public class FibonaciiSeries {

	public static void main(String[] args) {

		int count = 10;
		printFibonaciSeries(count);

	}

	private static void printFibonaciSeries(int count) {
		
		int a=0,b=1,c=1;
		
		for(int i=0;i<count;i++) {
			
			System.out.print(a+ ", ");
			a = b;
			b = c;
			c = a + b;
		}
		
	}

}
