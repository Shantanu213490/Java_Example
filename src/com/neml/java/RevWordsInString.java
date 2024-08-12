package com.neml.java;

public class RevWordsInString {

	public static void main(String[] args) {
		
		String s = "the sky is blue";
		String result = GetRevString.reverseWords(s);
		System.out.println(result);
	}

}
class GetRevString {
    public static String reverseWords(String s) {
    	
    	
    	String[] words = s.split("\\s+");
    	String result = "";
    	for(int i=words.length-1;i>-1;i--) {
    		
    		result +=" "+words[i];
    	}	
    	String strs =  result.toString();
		return strs.trim();
        
    }
}