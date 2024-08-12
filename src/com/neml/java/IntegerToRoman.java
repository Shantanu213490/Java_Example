package com.neml.java;

import java.util.HashMap;

public class IntegerToRoman {

	public static void main(String[] args) {
		
		int num = 1194;
		String result = GetRomanNumber.intToRoman(num);
		System.out.println(result);
	}

}
class GetRomanNumber {
    public static String intToRoman(int num) {
    	
    	String result = "";
    	int sum=0;
    	int rem=0;
    	HashMap<Integer,String> map = new HashMap<>();
    	
    	map.put(1,"I");
    	map.put(5,"V");
    	map.put(10,"X");
    	map.put(50,"L");
    	map.put(100,"C");
    	map.put(500,"D");
    	map.put(1000,"M");
    	
    	while(num>0) {
    		
    		if(num/1000!=0) {
    		rem=num%10;
    		sum=sum*10+rem;
    		num=num/10;
    		}
    	}
		return result;
        
    }
}


//Example 1:
//Input: num = 3
//Output: "III"
//Explanation: 3 is represented as 3 ones.
//
//Example 2:
//Input: num = 58
//Output: "LVIII"
//Explanation: L = 50, V = 5, III = 3.
//
//Example 3:
//Input: num = 1994
//Output: "MCMXCIV"
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.