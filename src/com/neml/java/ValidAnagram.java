package com.neml.java;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {

		String s = "rat";
		String t = "car";

		boolean result = CheckAnagram.isAnagram(s, t);
		System.out.println(result);

	}

}

class CheckAnagram {
	public static boolean isAnagram(String s, String t) {

		char[] charArray1 = s.toCharArray();
		Arrays.sort(charArray1);
		char[] charArray2 = t.toCharArray();
		Arrays.sort(charArray2);

		HashMap<Integer, Character> maps = new HashMap<>();
		HashMap<Integer, Character> mapt = new HashMap<>();

		if (s.length() != t.length()) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (!maps.containsKey(charArray1[i]) && !mapt.containsKey(charArray2[i])) {
				maps.put(i, charArray1[i]);
				mapt.put(i, charArray2[i]);
			}
		}
		System.out.println(maps);
		System.out.println(mapt);
		for (int i = 0; i < s.length(); i++) {
			if (!maps.get(i).equals(mapt.get(i))) {
				return false;
			}
		}
		return true;
	}
}
