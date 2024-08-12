package com.neml.gfgjava;

import java.util.HashSet;

public class DuplicateElementsOfStringGfg {

	public static void main(String[] args) {

		String str = "geEksforGEeks";
		
		String result = GetSortedString.removeDuplicates(str);
		System.out.println(result);

	}

}

class GetSortedString {
	static String removeDuplicates(String str) {
		
		HashSet<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
             str.charAt(i);
            

               
		}
        
        System.out.println(seen);
		return sb.toString();

	}
}

//Input:
//str = "geEksforGEeks"
//Output: 
//"geEksforG"
//Explanation: 
//After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".