package com.neml.practice;

import java.util.Scanner;

public class PrimeNumber {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        // Check if the number is prime and print the result
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	        
	        // Close the scanner
	        scanner.close();
	    }
	    
	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        // Corner case: 1 is not a prime number
	        if (num <= 1) {
	            return false;
	        }
	        
	        // Check for factors from 2 to the square root of num
	        for (int i = 2; i <= num/2; i++) {
	            if (num % i == 0) {
	                return false; // If a factor is found, num is not prime
	            }
	        }
	        
	        return true; // No factors found, num is prime
	    }
	}
