package com.neml.practice;

public class ReverseOfString {

	public static void main(String[] args) {


//		String str = "Hello world";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}
		
		StringBuilder str = new StringBuilder("Hello world");
		str.reverse();
		System.out.println(str);
		
		String st = str.toString();
		System.out.println(st);
	}

}
