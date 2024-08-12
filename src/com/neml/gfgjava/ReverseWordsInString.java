package com.neml.gfgjava;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String s = "i.like.this.program.very.much";
		String result = GetReverseWordsOfString.reverseWords(s);
		System.out.println(result);
	}

}
class GetReverseWordsOfString 
{
    //Function to reverse words in a given string.
    public static String reverseWords(String s){
    
//    	String[] strArray = s.split("\\.");
//    	String rev="";
//    	// Print each element of the array
//    	for (int i=strArray.length-1;i>=0;i--) {
//    		if(i==strArray.length-1) {
//    			rev+=strArray[i];
//    		}else {
//    			
//    			 rev += "." + strArray[i];
//    		}
//    	}
//    	System.out.println(rev);
//		return s;
    	
    	 String[] strArray = s.split("\\.");
         StringBuilder rev = new StringBuilder();

         for (int i = strArray.length - 1; i >= 0; i--) {
             if (i == strArray.length - 1) {
                 rev.append(strArray[i]);
             } else {
                 rev.append(".").append(strArray[i]);
             }
         }
         return rev.toString();
       
    }
}