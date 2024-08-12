package com.neml.java.multithreading;

public class ObjectLockingThread {

	public static void main(String[] args) {

		ObjectLockingt t1 = new ObjectLockingt();
		ObjectLockingt t2 = new ObjectLockingt();
		ObjectLockingt t3 = new ObjectLockingt();
		t3.setName("Thread-C");
		t3.start();
		t1.setName("Thread-A");
		t1.start();
		t2.setName("Thread-B");
		t2.start();
	}
}

class ObjectLockingt extends Thread {

	@Override
	public void run() {
		callingLockObject();
	}

	public static synchronized void callingLockObject() {

		synchronized (ObjectLockingt.class) {
			
				System.out.println("Thread : " + Thread.currentThread().getName() + " is acquiring Lock");	
				System.out.println(Thread.currentThread().getName() + " is exiting from the Lock");
				System.out.println("-------------------------------------------------");
		}
	}
}