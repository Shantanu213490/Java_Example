package com.neml.java.multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaitNotifyExample {

	public static void main(String[] args) {

	}

}

class OddNumbers extends Thread {

	@Override
	public void run() {

		System.out.println();
	}

}

class EvenNumbers extends Thread {

	List<Integer> ls = Arrays.asList(9, 5, 4, 6, 1);
	EvenOddNumbers even;

	@Override
	public void run() {

		System.out.println("Even number are " );
	}

	class EvenOddNumbers {

		void getEvenOddNumber() {
			List<Integer> ls = Arrays.asList(9, 5, 4, 6, 1);

			synchronized (this) {

				for (int i = 0; i < ls.size(); i++) {

					if (ls.get(i) % 2 == 0) {
						System.out.println(ls);
					} else {
						System.out.println(ls);
					}

				}
			}
		}

	}

}
