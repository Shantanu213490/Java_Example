package com.neml.oops;

class Employee{
	
	private String name;
	private int age;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee(String name, int age) {
		this.name = name;
        this.age = age;
        this.salary = 28000;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	void displayInfo() {
		System.out.println("Name : "+name+ ", Age : "+age+ ", Salary : "+salary);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("Alex");
		emp.setAge(23);
		emp.setSalary(35000);
		emp.displayInfo();
		
		Employee emp1 = new Employee("Max",24,38000);
		emp1.displayInfo();
		
		Employee emp2 = new Employee("Tom",24);
		emp2.displayInfo();
	}

}
//Question 7: Constructor Overloading
//Write a Java program to demonstrate constructor overloading.
//Create a class Employee with attributes name, age, and salary.
//Provide three constructors: one with no arguments, one with name and age arguments,and one with all three arguments.
//Create instances of Employee using each constructor and print the values of the attributes.