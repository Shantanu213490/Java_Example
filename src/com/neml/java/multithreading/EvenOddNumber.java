package com.neml.java.multithreading;

import java.util.*;

public class EvenOddNumber {

	static int arr[] = new int[] { 1, 6, 3, 8, 4 };
	static List<Integer> evenList = new ArrayList<>();
	static List<Integer> oddList = new ArrayList<>();

	public static void main(String[] args) {

		NatureOfNum();
		Thread th = new Thread() {

			public void run() {

				System.out.println("List of even number -> " + evenList);
			}
		};

		Thread th1 = new Thread() {
			public void run() {
				System.out.println("List of odd number -> " + oddList);
			}
		};

		th.start();
		th1.start();

	}

	static void NatureOfNum() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenList.add(arr[i]);
			} else {
				oddList.add(arr[i]);
			}
		}
	}

}