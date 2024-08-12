package com.neml.java.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedSemaphoreLockResource {

	boolean isAvailable = false;
	ReentrantLock lock = new ReentrantLock();
	Condition con = lock.newCondition();
	
	public void producer() {
		
		try {
			lock.lock();
			System.out.println("Producer lock acquired by " +Thread.currentThread().getName());
			if(isAvailable) {
				System.out.println("producer thread is waiting "+Thread.currentThread().getName());
				con.await();
			}
			isAvailable = true;
			con.signal();
		}catch (Exception e) {
			
		}finally {
			lock.unlock();
			System.out.println("Producer lock release by " +Thread.currentThread().getName());
		}
	}
	
public void consumer() {
		
		try {
			Thread.sleep(4000);
			lock.lock();
			System.out.println("consumer lock acquired by " +Thread.currentThread().getName());
			if(!isAvailable) {
				System.out.println("consumer thread is waiting "+Thread.currentThread().getName());
				con.await();
			}
			isAvailable = false;
			con.signal();
		}catch (Exception e) {
			
		}finally {
			lock.unlock();
			System.out.println("consumer lock release by " +Thread.currentThread().getName());
		}
	}
}
