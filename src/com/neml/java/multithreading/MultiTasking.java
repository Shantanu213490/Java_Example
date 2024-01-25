package com.neml.java.multithreading;

public class MultiTasking {

	public static void main(String[] args) throws InterruptedException {

		
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("--------------Using Runnable--------------------------------------");
				System.out.println("Task one using Runnable");
				
			}
		};
		
		Runnable task2 = new Runnable() {
			
			@Override
			public void run() {

				System.out.println("Task two using Runnable");
				
			}
		};
		
		Thread th2 = new Thread(task1);
		Thread th3 = new Thread(task2);
		
		th2.start();
		th2.join();
		th2.join();
		th3.start();
		
		
		

		Thread th = new Thread() {
			

			@Override
			public void run() {
				System.out.println("--------------Using Thread----------------------------------------");
				System.out.println("Task one using Thread");

			}
		};

		Thread th1 = new Thread() {

			@Override
			public void run() {

				System.out.println("Task two using Thread");

			}
		};
		
		th.join();
		th.start();
		th1.join();
		th1.start();
		
	}
}
