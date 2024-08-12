package com.neml.gfgjava;

public class PalindromeString {

	public static void main(String[] args) {

		String S = "epajfxzfnvte";
		int result = GetString.isPalindrome(S);
		System.out.println(result);

	}

}

class GetString {
	public static int isPalindrome(String S) {

//		String st = "";
//		int len = S.length();
//		for(int i=len-1;i>=0;i--) {
//			st+=S.charAt(i);
//		}
//		if(S.equalsIgnoreCase(st)) {
//			return 1;
//		}
//		return 0;
		
		int left = 0;
		int right = S.length() - 1;

		while (left < right) {
			if (S.charAt(left) != S.charAt(right)) {
				return 0; // If characters don't match, it's not a palindrome
			}
			left++;
			right--;
		}
		return 1;

	}
}