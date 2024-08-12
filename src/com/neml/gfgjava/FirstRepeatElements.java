package com.neml.gfgjava;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatElements {

	public static void main(String[] args) {
		
		int n = 7;
		int arr[] = {1, 5, 3, 4, 3, 5, 6};
		int result = GetRepeatingElement.firstRepeated(arr, n);
		System.out.println(result);

	}

}
class GetRepeatingElement {
    
    public static int firstRepeated(int[] arr, int n) {
    	
    	Map<Integer, Integer> map = new HashMap<>();
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int diff = i - map.get(arr[i]);
                System.out.println("diff : "+diff);
                minDiff = Math.min(minDiff, diff);
                System.out.println("minDiff : "+minDiff);
            } else {
                map.put(arr[i], i);
            }
        }

        System.out.println(minDiff);
        return minDiff == Integer.MAX_VALUE ? -1 : minDiff;
        
	}
}