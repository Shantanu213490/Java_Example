package com.neml.java;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
	
		String pattern = "abba";
		String s = "dog cat cat fish";
		boolean result = GetPattern.wordPattern(pattern, s);
		System.out.println(result);

	}

}
class GetPattern {
    public static boolean wordPattern(String pattern, String s) {
    	
    	 String[] strArray = s.split(" ");
    	 if (pattern.length() != strArray.length)
             return false;

         Map<Character, String> charToWord = new HashMap<>();
         Map<String, Character> wordToChar = new HashMap<>();

         for (int i = 0; i < pattern.length(); i++) {
             char c = pattern.charAt(i);
             String word = strArray[i];

             if (charToWord.containsKey(c)) {
                 if (!charToWord.get(c).equals(word))
                     return false;
             } else {
                 charToWord.put(c, word);
             }

             if (wordToChar.containsKey(word)) {
                 if (wordToChar.get(word) != c)
                     return false;
             } else {
                 wordToChar.put(word, c);
             }
         }

         return true;
        
    }
}