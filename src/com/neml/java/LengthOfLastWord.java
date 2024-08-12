package com.neml.java;

public class LengthOfLastWord {

	public static void main(String[] args) {

		String s = "a";
		int count = 0;
		String str = s.trim();

		for(int i=str.length()-1;i>=0;i--) {
			
			if(str.charAt(i) == ' ') {
				break;
			}else {
				count++;
			}
		}
		System.out.println(count);
	}
}