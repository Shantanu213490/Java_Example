//Question 1: Write a Java program to implement a producer-consumer problem using wait and notify.
//The producer thread should produce 10 numbers and the consumer thread should consume them.

package com.neml.java.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ProducerConsumerExample {

	public static void main(String[] args) {

		Object lock = new Object();
		AtomicBoolean isPrint = new AtomicBoolean(true);
		ProduceNumber producer = new ProduceNumber(lock, isPrint);
		ConsumerNumber consumer = new ConsumerNumber(lock, isPrint,producer);
		producer.start();
		consumer.start();
	}

}

class ProduceNumber extends Thread {

	private Object lock;
	private AtomicBoolean isPrint;
	List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	ProduceNumber(Object lock, AtomicBoolean isPrint) {
		this.lock = lock;
		this.isPrint = isPrint;
	}

	List<Integer> ls2 = getNumber();

	public void run() {

		try {
			synchronized (lock) {

				for (int i : ls2) {
					while(!isPrint.get()) {
						lock.wait();
					}
					System.out.println("Producing number : " + i);
					isPrint.set(false);
					lock.notify();
				}
			}
		} catch (Exception e) {

			e.getStackTrace();

		}
	}

	List<Integer> getNumber() {

		return ls;
	}
}

class ConsumerNumber extends Thread {

	private Object lock;
	private AtomicBoolean isPrint;
	ProduceNumber number;

	public ConsumerNumber(Object lock, AtomicBoolean isPrint,ProduceNumber number) {
		this.lock = lock;
		this.isPrint = isPrint;
		this.number = number;
	}

	public void run() {
		List<Integer> ls = number.getNumber();
		try {
			synchronized (lock) {

				for (int i : ls) {
					while(isPrint.get()) {
						lock.wait();
					}
					System.out.println("Consuming number : " + i);
					isPrint.set(true);
					lock.notify();
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}
