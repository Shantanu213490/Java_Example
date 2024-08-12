package com.neml.java;

public class IsomorphicString {

	public static void main(String[] args) {

		String s = "paper";
		String t = "title";

		Solution ob = new Solution();

		boolean result = ob.isIsomorphic(s, t);
		System.out.println(result);
	}

}

class Solution {
	public boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length()) {

			return false;
		} 
		
		char[] sToCh = new char[256];
		char[] tToCh = new char[256];
		
		for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check if the mapping is consistent
            if (sToCh[sChar] == 0 && tToCh[tChar] == 0) {
            	sToCh[sChar] = tChar;
            	tToCh[tChar] = sChar;
            } else if (sToCh[sChar] != tChar || tToCh[tChar] != sChar) {
                return false;
            }
        }
		
		return true;
	}
}
