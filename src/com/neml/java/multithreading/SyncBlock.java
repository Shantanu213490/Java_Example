package com.neml.java.multithreading;

public class SyncBlock {

	public static void main(String[] args) {

		Table ta1 = new Table();
		Table ta2 = new Table();

		MyThread1 t1 = new MyThread1(ta1);
		MyThread2 t2 = new MyThread2(ta1);
		MyThread3 t3 = new MyThread3(ta2);
		MyThread4 t4 = new MyThread4(ta2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class Table {

	public void printTable(int n) {

		synchronized (this) {
			for (int i = 1; i < 5; i++) {

				try {
				System.out.println(Thread.currentThread().getName()+ " - "+(n * i));
				Thread.sleep(500);
				}catch(Exception e) {
					
				}
			}
		}
	}
}

class MyThread1 extends Thread {

	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		try {
			t.printTable(1);
		} catch (Exception e) {

		}

	}

}

class MyThread2 extends Thread {

	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		try {
			t.printTable(10);
		} catch (Exception e) {

		}

	}

}
class MyThread3 extends Thread {

	Table t;

	MyThread3(Table t) {
		this.t = t;
	}

	public void run() {
		try {
			t.printTable(100);
		} catch (Exception e) {

		}

	}

}
class MyThread4 extends Thread {

	Table t;

	MyThread4(Table t) {
		this.t = t;
	}

	public void run() {
		try {
			t.printTable(1000);
		} catch (Exception e) {

		}

	}

}