package com.neml.java.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class MainLockFree {
	
	public static void main(String[] args) {
		
		
		SharedLockFreeResource resource = new SharedLockFreeResource();
		for(int i=0;i<5;i++) {
			resource.incrementCounter();
		}
	}
}
 
  class SharedLockFreeResource{
	 
	 AtomicInteger counter = new AtomicInteger(0);
		
		public void incrementCounter() {
			System.out.println("Incrementing the value of counter to " +counter.incrementAndGet());
			;
		}
		
		public int getCounter() {
			System.out.println("Getting the value of counter : " +counter.incrementAndGet());
			return counter.get();
		}
		
//		AtomicInteger counter = new AtomicInteger(1);
//	    
//	    public void incrementCounter() {
//	        int newValue = counter.incrementAndGet();
//	        System.out.println("Incrementing the value of counter to " + newValue);
//	    }
//	    
//	    public int getCounter() {
//	        return counter.get();
//	    }
	 
 }
