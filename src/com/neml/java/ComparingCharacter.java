package com.neml.java;

public class ComparingCharacter {

	public static void main(String[] args) {

		char[] array1 = { 'a', 'b', 'c', 'd', 'e' };
		char[] array2 = { 'b', 'd', 'f', 'g' };

		printCommonCharacters(array1, array2);

	}

	static void printCommonCharacters(char[] array1, char[] array2) {
		System.out.println("Common Characters:");

		for (char ch1 : array1) {
			for (char ch2 : array2) {
				if (ch1 == ch2) {
					System.out.print(ch1 + " ");
					break; // Once a common character is found, move to the next character in the first
							// array
				}
			}
		}

		System.out.println(); // Move to the next line for better formatting
	}
}
