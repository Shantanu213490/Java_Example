package com.neml;
public class PalindromeNumber {

	public static void main(String[] args) {
		
		int x = 12321;
        boolean result = isPalindrome(x);
        System.out.println(result);
        
	}
	 static boolean isPalindrome(int x) {
		 
		 int temp=x;
		 int sum=0;
		 while(x>0) { 
			 int rem=x%10;
			 sum=sum*10 + rem;
			 x=x/10;
		 }
		 if(sum==temp) {
			 return true;
		 }
		return false;
		 
	 }

}
