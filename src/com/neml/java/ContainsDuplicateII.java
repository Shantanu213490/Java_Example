package com.neml.java;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1, 2, 3 };
		int k = 2;

		boolean result = IsDuplicate.containsNearbyDuplicate(nums, k);
		System.out.println(result);
	}

}

class IsDuplicate {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {

//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
//					return true;
//				}
//			}
//		}
//		return false;

//		------------------alternative option---------------------------------

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
				return true;
			}
			map.put(nums[i], i);

		}
		return false;
	}
	
}

//Given an integer array nums and an integer k, return true if there are two distinct indices
//i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//Example 1:
//Input: nums = [1,2,3,1], k = 3
//Output: true
//
//Example 2:
//Input: nums = [1,0,1,1], k = 1
//Output: true
//
//Example 3:
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false
