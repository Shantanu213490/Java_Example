package com.neml.oops;

import java.util.ArrayList;
import java.util.List;

class Department {

    private String name;
    private List<String> courses;

    public Department(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return courses;
    }
}

class University {

    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println("Added department: " + department.getName());
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
        System.out.println("Removed department: " + department.getName());
    }

    public void printDepartments() {
        System.out.println("University: " + name);
        for (Department department : departments) {
            System.out.println("  Department: " + department.getName());
            for (String course : department.getCourses()) {
                System.out.println("    Course: " + course);
            }
        }
    }
}

public class CompositionExample {

    public static void main(String[] args) {

        University university = new University("RTMNU");

        List<String> computerScienceCourses = new ArrayList<>();
        computerScienceCourses.add("Java");
        computerScienceCourses.add("Python");
        Department computerScienceDepartment = new Department("Computer Science", computerScienceCourses);

        List<String> mechanicalEngineeringCourses = new ArrayList<>();
        mechanicalEngineeringCourses.add("Thermodynamics");
        mechanicalEngineeringCourses.add("Mechanics");
        Department mechanicalEngineeringDepartment = new Department("Mechanical Engineering", mechanicalEngineeringCourses);

        university.addDepartment(computerScienceDepartment);
        university.addDepartment(mechanicalEngineeringDepartment);

        university.printDepartments();

        university.removeDepartment(mechanicalEngineeringDepartment);

        university.printDepartments();
    }
}
//Write a Java program to demonstrate composition.
//Create a class University with attributes name and departments.
//Create a class Department with attributes name and courses.
//Create an array of Department objects within the University class.
//Provide methods to add and remove departments from the university.