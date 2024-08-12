package com.neml.java;

import java.util.LinkedHashSet;

public class DuplicateElementOfArray {
	
	public static void main(String[] args) {
		
		int  nums[] = {0,0,1,1,1,2,2,3,3,4};
		int result = getDuplicatesNumber.removeDuplicates(nums);
		System.out.println(result);
	}

}
class getDuplicatesNumber {
    public static int removeDuplicates(int[] nums) {
    	
    	
    	LinkedHashSet<Integer> ls = new LinkedHashSet<>();
    	for(int i=0;i<nums.length;i++) {
    		ls.add(nums[i]);
    	}
		return ls.size();
       
    }
}


//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
