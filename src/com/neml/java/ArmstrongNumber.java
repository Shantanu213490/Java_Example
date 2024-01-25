package com.neml.java;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num =153 ,sum=0, arms=0,n=0,temp=0;
		temp=num;
		for(int i=0 ; i<4 ; i++) {
			
			n = num % 10;  // 3
			num = num/10;
		}
		int result = getArmstrongNumber(n);
		System.out.println(result);
	}
	 public static int getArmstrongNumber(int n) {
		 
		    int arms = n*n*n;  // 
			int sum = 0;
			sum = sum + arms;
			return sum;
		}

}
