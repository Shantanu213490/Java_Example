package com.neml.java.multithreading;

public class StaticSync {

	public static void main(String[] args) {

		StaticSynchronization stsync1 = new StaticSynchronization();
		StaticSynchronization stsync2 = new StaticSynchronization();

		MyStaticThread1 t1 = new MyStaticThread1();
		MyStaticThread2 t2 = new MyStaticThread2();
		MyStaticThread3 t3 = new MyStaticThread3();
		MyStaticThread4 t4 = new MyStaticThread4();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class StaticSynchronization {

	public synchronized static void printTable(int n) {

		for (int i = 1; i < 5; i++) {

			try {
				System.out.println(Thread.currentThread().getName() + " - " + (n * i));
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

	}
}

class MyStaticThread1 extends Thread {

//	StaticSynchronization stsync;
//
//	MyStaticThread1(StaticSynchronization stsync) {
//		this.stsync = stsync;
//	}

	public void run() {

		StaticSynchronization.printTable(1);

	}
}

class MyStaticThread2 extends Thread {

//	StaticSynchronization stsync;
//
//	MyStaticThread2(StaticSynchronization stsync) {
//		this.stsync = stsync;
//	}

	public void run() {

		StaticSynchronization.printTable(10);

	}
}

class MyStaticThread3 extends Thread {

//	StaticSynchronization stsync;
//
//	MyStaticThread3(StaticSynchronization stsync) {
//		this.stsync = stsync;
//	}

	public void run() {

		StaticSynchronization.printTable(100);

	}
}

class MyStaticThread4 extends Thread {

//	StaticSynchronization stsync;
//
//	MyStaticThread4(StaticSynchronization stsync) {
//		this.stsync = stsync;
//	}

	public void run() {

		StaticSynchronization.printTable(1000);

	}
}