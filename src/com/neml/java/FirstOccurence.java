package com.neml.java;

public class FirstOccurence {

	public static void main(String[] args) {

		String haystack = "sadbutsad";
		String needle = "sad";

		int result = Solution6.strStr(haystack, needle);
		System.out.println(result);

	}

}

class Solution6 {
	public static int strStr(String haystack, String needle) {

		int result = 0;
		if (haystack.contains(needle)) {

			result = haystack.indexOf(needle);
			return result;
		}
		return -1;

	}
}

//----------------------------------------------------------------
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//Example 2:
//
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.