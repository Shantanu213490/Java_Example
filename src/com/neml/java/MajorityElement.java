package com.neml.java;

public class MajorityElement {

	public static void main(String[] args) {

		int[] nums = {2,2,1,1,1,2,2};
		int result = Solution8.majorityElement(nums);
		System.out.println(result);
	}

}

class Solution8 {
	public static int majorityElement(int[] nums) {

		if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty");
        }

        int count = 0;
        Integer majority = null;

        for (int num : nums) {
            if (count == 0) {
                majority = num;
            }

            count += (num == majority) ? 1 : -1;
        }

        return majority;

	}
}
