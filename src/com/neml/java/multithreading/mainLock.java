package com.neml.java.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class mainLock {

	public static void main(String[] args) {
//		=============================ReentrantLock=================================================
		ReentrantLock lock = new ReentrantLock();

		SharedReentrantLockResource resource1 = new SharedReentrantLockResource();
		Thread th = new Thread() {

			public void run() {
				resource1.producer(lock);
			}
		};
		SharedReentrantLockResource resource2 = new SharedReentrantLockResource();
		Thread th1 = new Thread() {

			public void run() {
				resource2.producer(lock);
			}
		};

		th.start();
		th1.start();
//      =============================ReadWrite Lock=================================================	
//		SharedReadWriteLock resource1 = new SharedReadWriteLock();
//		ReadWriteLock lock = new ReentrantReadWriteLock();
//		
//		Thread th2 = new Thread() {
//
//			public void run() {
//				resource1.producer(lock);
//			}
//		};
//		Thread th3 = new Thread() {
//
//			public void run() {
//				resource1.producer(lock);
//			}
//		};
//		SharedReadWriteLock resource3 = new SharedReadWriteLock();
//		
//		Thread th4 = new Thread() {
//
//			public void run() {
//				resource3.consumer(lock);
//			}
//		};
//			th2.start();
//			th3.start();
//			th4.start();
//		
//	}
//		=============================Stamped Lock=================================================	
//		SharedStampedLock resource1 = new SharedStampedLock();
////		ReadWriteLock lock = new ReentrantReadWriteLock();
//		
//		Thread th2 = new Thread() {
//
//			public void run() {
//				resource1.producer();
//			}
//		};
//		Thread th3 = new Thread() {
//
//			public void run() {
//				resource1.producer();
//			}
//		};
//	
//		Thread th4 = new Thread() {
//
//			public void run() {
//				resource1.consumer();
//			}
//		};
//			th2.start();
//			th3.start();
//			th4.start();
//		
//	}
//	=============================Stamped optimistic Lock=================================================	
//	SharedStampedLockUsingOptimistic resource1 = new SharedStampedLockUsingOptimistic();
////	ReadWriteLock lock = new ReentrantReadWriteLock();
//	
//	Thread th2 = new Thread() {
//
//		public void run() {
//			resource1.producer();
//		}
//	};
//	
//
//	Thread th3 = new Thread() {
//
//		public void run() {
//			resource1.consumer();
//		}
//	};
//		th2.start();
//		th3.start();

//		=============================Stamped optimistic Lock=================================================		
//		SharedSemaphoreLockResource resource1 = new SharedSemaphoreLockResource();
////		ReadWriteLock lock = new ReentrantReadWriteLock();
//
//		Thread th2 = new Thread() {
//
//			public void run() {
//				for (int i = 0; i < 2; i++) {
//					resource1.producer();
//				}
//			}
//		};
//
//		Thread th3 = new Thread() {
//
//			public void run() {
//				for (int i = 0; i < 2; i++) {
//					resource1.consumer();
//				}
//			}
//		};
//		
//		th2.start();
//		th3.start();
//
	}

}
