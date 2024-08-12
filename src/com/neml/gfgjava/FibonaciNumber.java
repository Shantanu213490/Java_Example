package com.neml.gfgjava;

public class FibonaciNumber {

	public static void main(String[] args) {
		
		int n=5;
		int result = GetFibonaciNum.nthFibonacci(n);
		System.out.println(result);
	}

}
class GetFibonaciNum {
    static int nthFibonacci(int n){
    	
    	int a=0,b=1,fib=0;
    	for(int i=0;i<n;i++) {
    		
    		fib=a+b;
    		a=b;
    		b=fib;
    		System.out.println(fib);
    		
    	}
		return fib;
      
    }
}