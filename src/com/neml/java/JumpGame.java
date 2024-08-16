package com.neml.java;

import java.util.HashMap;
import java.util.Map;

public class JumpGame {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 1, 0, 4 };
		IsMaximumJump isMaximumJump = new IsMaximumJump();
		boolean result = isMaximumJump.canJump(nums);
		System.out.println(result);

	}

}

class IsMaximumJump {

	public boolean canJump(int[] nums) {

		 int maxReachableIndex = 0;
		    for (int i = 0; i < nums.length; i++) {
		        if (i > maxReachableIndex) {
		            return false;
		        }
		        maxReachableIndex = Math.max(maxReachableIndex, i + nums[i]);
		    }
		    return true;

	}

}
//Jump Game

//You are given an integer array nums. You are initially positioned at the array's first index,
//and each element in the array represents your maximum jump length at that position.
//Return true if you can reach the last index, or false otherwise.
//
//Example 1:
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

//Example 2:
//Input: nums = [3,2,1,0,4]
//Output: false
//Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0,
//which makes it impossible to reach the last index.