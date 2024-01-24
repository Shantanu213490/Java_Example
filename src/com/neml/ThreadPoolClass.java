package com.neml;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadPoolClass {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);

		for (int i = 0; i < 5; i++) {

			Runnable th = new ThreadClass("message " + i);
			executor.execute(th);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}

class ThreadClass implements Runnable {
	
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			
			ScheduledMethod();
		}
	};

	String message;

	ThreadClass(String message) {

		this.message = message;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " | message = " + message);
		waitForThread();
		System.out.println(Thread.currentThread().getName() + " | End");

	}

	void waitForThread() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	void ScheduledMethod() {
		System.out.println("This is scheduled Method");
	}

}