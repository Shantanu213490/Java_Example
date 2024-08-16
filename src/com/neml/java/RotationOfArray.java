package com.neml.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class RotationOfArray {

	public static void main(String[] args) {

		int[] nums = { 1,2,3,4,5,6,7 };
		int k = 4;
		k = k % nums.length;
		List<Integer> ls = new ArrayList<>();
		for (int n : nums) {
			ls.add(n);
		}
		List<Integer> ls1 = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			ls1.add(ls.get(i));
		}
		for (int i = 0; i < k; i++) {
			ls.remove(ls.get(0));
		}

		for (int i = 0; i < k; i++) {

			ls.add(ls1.get(i));
		}

//		Collections.sort(ls);
		int[] arr = new int[ls.size()];
		for (int i = 0; i < ls.size(); i++) {
			arr[i] = ls.get(i);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print("" + arr[i] + " ");
		}
	}
}

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
//Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//		
//Example 2:
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation: 
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]