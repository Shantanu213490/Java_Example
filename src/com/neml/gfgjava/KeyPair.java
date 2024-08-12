package com.neml.gfgjava;

import java.util.HashSet;
import java.util.Set;

public class KeyPair {

	public static void main(String[] args) {

		int n = 6, x = 16;
		int arr[] = { 1, 4, 45, 6, 10, 8 };
		boolean result = GetPair.hasArrayTwoCandidates(arr, n, x);
		System.out.println(result);
	}
}

class GetPair {
	public static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int target = x - arr[i];
			if (set.contains(target)) {
				return true;
			}
			set.add(arr[i]);
		}
		return false;
	}
}