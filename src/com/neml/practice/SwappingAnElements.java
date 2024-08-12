package com.neml.practice;

public class SwappingAnElements {

	public static void main(String[] args) {
		
		int a = 37;
		int b = 67;
		int temp = 0;
		
		temp = b;
		b = a;
		a = temp;
//		
//		a = a + b;//104
//		b = a - b;//104 - 67 = 37
//		a = a - b;//100 - 37 = 67
		
		
		System.out.println("a : "+a+ " ||  b : "+b);

	}

}
