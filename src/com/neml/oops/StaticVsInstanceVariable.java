package com.neml.oops;

class Student {

	public static String schoolName = "SOS PUBLIC SCHOOL";
	private String studentName;

	public Student(String studentName) {
		this.studentName = studentName;
	}

	void displayInfo() {
		System.out.println("Student Name : " + studentName + ", School Name : " + schoolName);
	}

}

public class StaticVsInstanceVariable {

	public static void main(String[] args) {

		Student student1 = new Student("Galle");
		Student student2 = new Student("Jalle");
		Student student3 = new Student("Falle");
		Student student4 = new Student("Halle");

		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();

	}

}
//Question 9: Static vs Instance Variables
//Write a Java program to demonstrate the difference between static and instance variables.
//Create a class Student with a static variable schoolName and an instance variable studentName.
//Create multiple instances of Student and print the values of schoolName and studentName for each instance.