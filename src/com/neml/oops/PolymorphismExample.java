package com.neml.oops;

class Shapes {

	double area() {

		return 0;
	}
}

class Circle extends Shapes {

	double area = 0.00f;
	double radius = 0;
	
	 public Circle(double radius) {
	        this.radius = radius;
	    }

	double area() {
		area = Math.PI * radius * radius;
		System.out.println("Area of circle is "+area);
		return area;
	}
}

class Rectangle extends Shapes {

	double area = 0.00f;
	int length = 0;
	int breadth = 0;
	
	public Rectangle(int length,int breadth) {
		
		this.length =  length;
		this.breadth = breadth;
		
	}

	double area() {
		area = length * breadth;
		System.out.println("Area of Rectangle is "+area);
		return area;
		
	}
}

public class PolymorphismExample {

	public static void main(String[] args) {
		
		Shapes[] shapes1 = new Shapes[2];
		shapes1[0] =  new Circle(4);
		shapes1[1] = new Rectangle(7,8);
		
		double totalArea = 0.00f;
		for(Shapes i:shapes1) {
			totalArea += i.area();
		}
		System.out.println("Calculated total area is " +totalArea);
	}

}
//Question 2:Write a Java program to demonstrate the concept of polymorphism.
//Define a class Shape with a method area() and create two subclasses Circle and Rectangle that override the area() method.
//Create an array of Shape objects and calculate the total area of all shapes.