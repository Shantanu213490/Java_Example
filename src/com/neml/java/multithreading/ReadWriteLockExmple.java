package com.neml.java.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExmple {

	private final ReadWriteLock rwl = new ReentrantReadWriteLock();
	private final Lock read = rwl.readLock();
	private final Lock write = rwl.writeLock();
	private final List<Object> list = new ArrayList<>();

	public void setElements(Object ob) {

		write.lock();

		try {

			list.add(ob);
			System.out
					.println("Element " + list.get(0) + " by thread " + Thread.currentThread().getName() + " is added");

		} finally {
			write.unlock();
		}

	}

	public Object getElements() {

		read.lock();
		try {
			System.out.println("Element by thread " + Thread.currentThread().getName() + " is printed");
		} finally {
			read.unlock();
		}
		return list;

	}

	public static void main(String[] args) {

		ReadWriteLockExmple rwLock = new ReadWriteLockExmple();
		rwLock.setElements("Hello");
		rwLock.setElements("Neml");
		rwLock.setElements("FU");

		System.out.println("Printing the last element : " + rwLock.getElements());

	}

}
