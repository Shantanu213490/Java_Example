package com.neml.java.multithreading;


public class ThreadSleep extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		
	  mainThread = Thread.currentThread();
		
		try {
			
			ThreadSleep ts = new ThreadSleep();
			
			ts.start();
			
			System.out.println("Current ThreadName : " + Thread.currentThread().getName());
			ts.sleep(500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 static Thread mainThread;
		@Override
		public void run() {

			try {
				mainThread.join();		
				for (int i = 0; i < 3; i++) {
					System.out.println("Child ThreadName : " + Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}