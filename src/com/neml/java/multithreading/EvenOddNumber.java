package com.neml.java.multithreading;

public class EvenOddNumber {

	static int num = 1;

	public static void main(String[] args) {

		getEvenNumber th1 = new getEvenNumber();
		th1.start();

		getOddNumber th2 = new getOddNumber();
		th2.start();

	}

}

class getEvenNumber extends Thread {

	@Override
	public void run() {

		if (EvenOddNumber.num % 2 == 0) {
			System.out.println(EvenOddNumber.num + " is an even number.");
		} else {
			System.out.println(EvenOddNumber.num + " is not an even number.");
		}

	}
}

class getOddNumber extends Thread {

	@Override
	public void run() {

		if (EvenOddNumber.num % 2 != 0) {
			System.out.println(EvenOddNumber.num + " is an odd number.");
		} else {
			System.out.println(EvenOddNumber.num + " is not an odd number.");
		}

	}

}