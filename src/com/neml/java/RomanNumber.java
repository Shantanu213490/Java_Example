package com.neml.java;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

	public static void main(String[] args) {	

		String s = "MCMXCIV";
		int result = Solution7.romanToInt(s);
		System.out.println(result);
	}

}
class Solution7 {
    public static int romanToInt(String s) {
    	
    	int sum=0;
    	int preValue = 0;
    	Map<Character,Integer> roman = new HashMap<>();
    	roman.put('I', 1);
    	roman.put('V', 5);
    	roman.put('X', 10);
    	roman.put('L', 50);
    	roman.put('C', 100);
    	roman.put('D', 500);
    	roman.put('M', 1000);
    	
    	for(int i=s.length()-1;i>=0;i--) {
    		
    		char ch = s.charAt(i);
    		int currentValue = roman.get(ch);
    		if(currentValue > preValue) {
    			
    			sum += currentValue;
    			
    		}else if(currentValue == preValue){
    	
    			sum+=currentValue;
    			
    		}else {
    			sum -= currentValue;
    		}
    		preValue = currentValue;
    	}
		
    	return sum;
    }
}

//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000