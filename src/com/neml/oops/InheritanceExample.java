package com.neml.oops;

//Inheritance Example
class Animal {

	void sound() {
		System.out.println("Sound of Animal");
	}

}
class Dog extends Animal{
	
	void sound() {
		System.out.println("Dog - Barks");
	}
	
}
class Cat extends Animal{

	void sound() {
		System.out.println("Cat - sounds");
	}
	
}
public class InheritanceExample{
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
	
		
	}
	
}
//Question 1: Create a Java program to demonstrate the concept of inheritance.
//Define a class Animal with a method sound() and create two subclasses Dog and Cat that override the sound() method.