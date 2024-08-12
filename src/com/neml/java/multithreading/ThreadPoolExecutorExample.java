package com.neml.java.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {

	public static void main(String[] args) {

		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
				new CustomThreadFactory(), new CustomRejectHandler());

		executor.allowCoreThreadTimeOut(true);
		
		for (int i = 1; i <= 7; i++) {

			executor.submit(() -> {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				System.out.println("Task Processed by : " + Thread.currentThread().getName());
				
			});
		}
		executor.shutdown();

	}

}

class CustomThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {

		Thread th = new Thread(r);
		th.setPriority(Thread.NORM_PRIORITY);
		th.setDaemon(false);
//		th.setName("defaultThread");
		return th;
	}

}

class CustomRejectHandler implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

		System.out.println("Task Rejected : " + r.toString());

	}

}