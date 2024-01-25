package com.neml.java.multithreading;

public class JoinThread {

	public static void main(String[] args) throws InterruptedException {

		Thread th = Thread.currentThread();

		JoiningMethod j1 = new JoiningMethod();
		j1.start();
		j1.join();

		try {
			for (int i = 1; i < 5; i++) {
				System.out.println("Thread Name : " + Thread.currentThread().getName() + "" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class JoiningMethod extends Thread {
	public void run() {

		try {

			for (int i = 1; i < 5; i++) {
				System.out.println("Thread Name : " + Thread.currentThread().getName() + " | count : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
