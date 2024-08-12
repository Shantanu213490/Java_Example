package com.neml.java.multithreading;

import java.util.concurrent.locks.StampedLock;

public class SharedStampedLock {

	boolean isAvailable = false;
	StampedLock lock = new StampedLock();

	public void producer() {

		long stamp = lock.readLock();
		try {

			System.out.println("Read Lock acquired by : " + Thread.currentThread().getName());
			isAvailable = true;
			Thread.sleep(4000);
		} catch (Exception e) {

		} finally {
			lock.unlockRead(stamp);
			System.out.println("Read Lock release by : " + Thread.currentThread().getName());
		}
	}

	public void consumer() {

		long stamp = lock.writeLock();
		try {
			System.out.println("Write Lock acquired by : " + Thread.currentThread().getName());
			isAvailable = false;
			Thread.sleep(4000);
		} catch (Exception e) {

		} finally {
			lock.unlockWrite(stamp);
			System.out.println("Write Lock release by : " + Thread.currentThread().getName());
		}
	}

}
