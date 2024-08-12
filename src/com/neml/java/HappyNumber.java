package com.neml.java;

public class HappyNumber {

	public static void main(String[] args) {

		int n = 1221;
		boolean result = GetHappyNumber.isHappy(n);
		System.out.println(result);
	}
}

class GetHappyNumber {
	public static boolean isHappy(int n) {

		while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
	}
}

//Example 1:
//Input: n = 19
//Output: true
//Explanation:
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 02 = 1

//Example 2:
//
//Input: n = 2
//Output: false