package com.neml.oops;

class Outer{
	
	void outerMethod() {
		System.out.println("This is outer class method");
	}
	
	class Inner{
		void innerMethod() {
			System.out.println("This is inner class method");
		}
	}
	public void createAndCallInner() {
        Inner inner = new Inner();
        inner.innerMethod();
    }
	
}
public class InnerClassExample {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.outerMethod();
		outer.createAndCallInner();

		
	}

}
//Question 10: Inner Classes
//Write a Java program to demonstrate inner classes.
//Create a class Outer with an inner class Inner.
//Provide a method in Outer that creates an instance of Inner and calls a method on it.
//Create an instance of Outer and call the method that creates the Inner instance.