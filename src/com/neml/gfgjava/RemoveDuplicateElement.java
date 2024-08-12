package com.neml.gfgjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {

		int n = 42;
		int[] array = { 1, 3, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27, 28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62,
				63, 65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100 };
		int result = GetIndexOfArr.remove_duplicate(array, n);
		System.out.println(result);
	}

}

class GetIndexOfArr {
	public static int remove_duplicate(int A[], int N) {

		ArrayList<Integer> ls = new ArrayList<>();
		for (int i = 0; i < N; i++) {

			if (!ls.contains(A[i])) {
				ls.add(A[i]);
			}

		}
		int[] arr = new int[ls.size()];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = ls.get(i);

		}
		return arr.length;

	}
}