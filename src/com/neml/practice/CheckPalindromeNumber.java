package com.neml.practice;

public class CheckPalindromeNumber {

	public static void main(String[] args) {

		int num = 131;
		boolean result = isPalindrome(num);
		System.out.println(num+ " is a palindrome : "+result);

	}

	private static boolean isPalindrome(int num) {

		int n = 0;
		int rev = 0;
		int sum = 0;
		int temp = num;

		while (num != 0) {
			rev = num % 10;
			sum = sum * 10 + rev;
			num =num/10;
		}
		
		if(temp == sum) {
			return true;
		}
		return false;
	}

}
