package com.neml.practice;

import java.util.Scanner;

public class CheckwhetherVowelPresent {

	public static void main(String[] args) {
		
		System.out.print("Enter a character : ");
		Scanner sc = new Scanner(System.in);
		  String input = sc.next();
	        
	        // Get the first character of the string
	        char character = input.charAt(0);
	        
	        if(character == 'a'||character =='e'||character =='i'||character=='o'||character=='u') {
	        	System.out.println("character "+character+ " is a vowel");
	        }else {
	        	System.out.println("character "+character+ " is not a vowel");
	        }

	}

}
