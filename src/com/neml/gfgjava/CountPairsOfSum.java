package com.neml.gfgjava;

import java.util.HashMap;

public class CountPairsOfSum {

	public static void main(String[] args) {

		int n = 4, k = 6;
		int arr[] = {1, 5, 7, 1};
		int count = GetCountOfPairs.getPairsCount(arr, n, k);
		System.out.println(count);

	}

}

class GetCountOfPairs {
	public static int getPairsCount(int[] arr, int n, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

       
        for (int i = 0; i < n; i++) {
            int complement = k - arr[i];
            System.out.println(complement+ " = "+k+ " - "+arr[i]);
            if (map.containsKey(complement)) {
            	System.out.println(count);
                count += map.get(complement);
                System.out.println(count);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.println(map);
        }

        return count;

	}
}