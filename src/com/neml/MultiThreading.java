package com.neml;

class ThreadName implements  Runnable {
	
	@Override
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
		System.out.println(Thread.currentThread().getName()+ " is a Daemon Thread");
		}
	}
}
public class MultiThreading {
	public static void main(String[] args) {
		
		System.out.println("Current Thread Name : " + Thread.currentThread().getName() + " | Current Thread Priority : "
				+ Thread.currentThread().getPriority());
		
		System.out.println("-------------------------------------------------------------------");
		
		ThreadName t1 = new ThreadName();
		ThreadName t2 = new ThreadName();
		ThreadName t3 = new ThreadName();
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
	
		System.out.println("Current Thread Name : " + th1.getName() + " | Current Thread Priority : "
				+ th1.getPriority());
		System.out.println("Current Thread Name : " + th2.getName() + " | Current Thread Priority : "
				+ th2.getPriority());
		System.out.println("Current Thread Name : " + th3.getName() + " | Current Thread Priority : "
				+ th3.getPriority());
		
		System.out.println("-------------------------------------------------------------------");
		
		th1.setName("ThreadName1");
		th1.setPriority(3);
		th1.setDaemon(true);
		
		th2.setName("ThreadName2");
		th2.setPriority(7);
		
		th3.setName("ThreadName3");
		th3.setPriority(9);
		
		System.out.println("Current Thread Name : " + th1.getName() + " | Current Thread Priority : "
				+ th1.getPriority());
		System.out.println("Current Thread Name : " + th2.getName() + " | Current Thread Priority : "
				+ th2.getPriority());
		System.out.println("Current Thread Name : " + th3.getName() + " | Current Thread Priority : "
				+ th3.getPriority());
		
		th1.start();
	    t1.run();
	}
}
