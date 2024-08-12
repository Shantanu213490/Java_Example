package com.neml.java.multithreading;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedReadWriteLock {
	
	boolean isAvailable = false;
//	ReentrantLock lock = new ReentrantLock();
	
	public void producer(ReadWriteLock lock) {
		
		try {
			
			lock.readLock().lock();		
			System.out.println("Read Lock acquired by : " +Thread.currentThread().getName());
			isAvailable=true;
			Thread.sleep(4000);
		}catch(Exception e) {
			
			
		}finally {
			lock.readLock().unlock();
		System.out.println("Read Lock release by : " +Thread.currentThread().getName());
		}
	}
	
public void consumer(ReadWriteLock lock) {
		
		try {
			
			lock.writeLock().lock();		
			System.out.println("Write Lock acquired by : " +Thread.currentThread().getName());
			isAvailable=true;
			Thread.sleep(4000);
		}catch(Exception e) {
			
			
		}finally {
			lock.writeLock().unlock();
		System.out.println("Write Lock release by : " +Thread.currentThread().getName());
		}
	}


}
