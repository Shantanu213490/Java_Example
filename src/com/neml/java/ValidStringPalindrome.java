package com.neml.java;

public class ValidStringPalindrome {

	public static void main(String[] args) {

		String s = " ";
		Solution3 sol = new Solution3();
		boolean result = sol.isPalindrome(s);
		System.out.println(result);
	}
}

class Solution3 {
	public boolean isPalindrome(String s) {

		String rmStr = s.replaceAll("\\s", "").replaceAll(",", "").replaceAll(":", "").toLowerCase();

		char[] c = rmStr.toCharArray();
		String rev = "";
		for (int i = c.length - 1; i >= 0; i--) {
			rev += c[i];
		}
		String revStr = rev.toLowerCase();

		if (rmStr.equals(revStr)) {
			return true;
		} else {
			return false;
		}

	}
}