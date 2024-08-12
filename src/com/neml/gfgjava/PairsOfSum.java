package com.neml.gfgjava;

import java.util.ArrayList;
import java.util.List;

public class PairsOfSum {

	public static void main(String[] args) {

		long A[] = { 1, 2, 4, 5, 7 };
		long B[] = { 5, 6, 3, 4, 8 };
		long N = 5, M = 5, X = 9;

		Pair[] pair = GetPairCount.allPairs(A, B, N, M, X);
		for (int i = 0; i < pair.length; i++) {
			System.out.println("Pair: " + pair[i].first + ", " + pair[i].second);
		}

	}

}

class GetPairCount {
	public static Pair[] allPairs(long A[], long B[], long N, long M, long X) {

		List<Pair> pairList = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (A[i] + B[j] == X) {
					pairList.add(new Pair(A[i], B[j]));
				}
			}
		}

		// Convert list to array
		Pair[] pairs = new Pair[pairList.size()];
		pairList.toArray(pairs);
		return pairs;
	}

}

class Pair {
	long first, second;

	public Pair(long first, long second) {
		this.first = first;
		this.second = second;
	}
}