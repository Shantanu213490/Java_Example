package com.neml.java.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class SharedReentrantLockResource {
	
	boolean isAvailable = false;
	int count = 0 ;
//	ReentrantLock lock = new ReentrantLock();
	
	public void producer(ReentrantLock lock) {
		
		try {
			
			lock.lock();
			count++;
			System.out.println("Lock acquired by : " +Thread.currentThread().getName()+ " with count : "+count);			
			Thread.sleep(1000);
		}catch(Exception e) {
			
			
		}finally {
			lock.unlock();
		System.out.println("Lock release by : " +Thread.currentThread().getName()+ " with count : "+count);
		}
	}

}
