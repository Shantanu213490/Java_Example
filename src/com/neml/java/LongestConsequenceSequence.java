package com.neml.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsequenceSequence {

	public static void main(String[] args) {

		int[] nums = { 1 };
		int result = GetLengthOfSequence.longestConsecutive(nums);
		System.out.println(result);
	}

}

class GetLengthOfSequence {
	public static int longestConsecutive(int[] nums) {

		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
		    set.add(num);
		}

		List<Integer> ls = new ArrayList<>(set);
		Collections.sort(ls);

		if (ls.isEmpty()) {
		    return 0;
		} else if (ls.size() == 1) {
		    return 1;
		}

		int count = 1, result = 1;
		for (int i = 0; i < ls.size() - 1; i++) {
		    if (ls.get(i + 1) - ls.get(i) == 1) {
		        count++;
		        result = Math.max(result, count);
		    } else {
		        count = 1;
		    }
		}
		return result;

	}
}
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.

//Example 1:
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//
//Example 2:
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9