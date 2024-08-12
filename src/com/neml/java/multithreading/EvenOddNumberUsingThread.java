package com.neml.java.multithreading;

public class EvenOddNumberUsingThread {

	public static void main(String[] args) {

		PrintEvenNumber e = new PrintEvenNumber();

		PrintOddNumber o = new PrintOddNumber();
		e.start();
		o.start();

	}

}

class PrintEvenNumber extends Thread {

	int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public void run() {

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {

				System.out.println(num[i]);
			}
		}

	}

}

class PrintOddNumber extends Thread {

	int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public void run() {
		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 != 0) {

				System.out.println(num[i]);
			}
		}

	}

}