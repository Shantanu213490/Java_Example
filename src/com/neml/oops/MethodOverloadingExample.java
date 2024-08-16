package com.neml.oops;

class Calculator{

	int result=0;
	
	void add(int a,int b){
		result = a+b;
		System.out.println("Addition of "+a+ " and "+b+ " is "+result);
		
	}
	void multiply(int a,int b) {
		result = a*b;
		System.out.println("Multiplication of "+a+ " and "+b+ " is "+result);
	}
	void add(int a,int b,int c){
		result = a+b+c;
		System.out.println("Addition of "+a+ ", "+c+" and "+b+ " is "+result);
		
	}
	void multiply(int a,int b,int c) {
		result = a*b*c;
		System.out.println("Multiplication of "+a+ ", "+c+" and "+b+ " is "+result);
	}
	
	
}
public class MethodOverloadingExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.add(2, 3);
		calculator.multiply(5, 9);
		calculator.add(45, 39, 78);
		calculator.multiply(34, 9, 44);
		
	}

}
//Question 8: Method Overloading
//Write a Java program to demonstrate method overloading.
//Create a class Calculator with methods add() and multiply() that take two int arguments.
//Overload the add() and multiply() methods to take three int arguments.
//Create instances of Calculator and call the overloaded methods.