package com.neml.java;

import java.util.HashSet;
import java.util.Set;

public class CommonPrefix {

	public static void main(String[] args) {

		String[] strs = { "cir", "car" };

		String result = Solution5.longestCommonPrefix(strs);
		System.out.println(result);
	}

}

class Solution5 {
	public static String longestCommonPrefix(String[] strs) {

		if (strs.length > 1) {
			Set<Character> commonCharacters = new HashSet<>();
			for (char c : strs[0].toCharArray()) {
				commonCharacters.add(c);
			}

			for (int i = 1; i < strs.length; i++) {
				Set<Character> currentCharacters = new HashSet<>();
				for (char c : strs[i].toCharArray()) {
					currentCharacters.add(c);
				}

				commonCharacters.retainAll(currentCharacters);
			}
			String result1 = commonCharacters.toString().replaceAll("\\s", "").replaceAll(",", "").replace("[", "")
					.replace("]", "");
			return result1;

		}
			else if(strs.length == 1){
			return strs[0];
		}
		return "";
	}
}