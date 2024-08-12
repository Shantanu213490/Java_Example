package com.neml.java.multithreading;

import java.util.concurrent.locks.StampedLock;

public class SharedStampedLockUsingOptimistic {
	
	int a=10;
	StampedLock lock = new StampedLock();

	public void producer() {

		long stamp = lock.tryOptimisticRead();
		try {

			System.out.println("Taken Optimistic Lock");
			a=11;
			Thread.sleep(4000);
			if(lock.validate(stamp)) {
				System.out.println("value of a updated succesfully");
			}else {
				System.out.println("Rollback of work");
				a=10;
			}
		} catch (Exception e) {

		} 
	}

	public void consumer() {

		long stamp = lock.writeLock();
		System.out.println("Write Lock acquired by : " + Thread.currentThread().getName());
		try {
			System.out.println("performing work");
			a = 9;
//			Thread.sleep(4000);
		} catch (Exception e) {

		} finally {
			lock.unlockWrite(stamp);
			System.out.println("Write Lock release by : " + Thread.currentThread().getName());
		}
	}

}
