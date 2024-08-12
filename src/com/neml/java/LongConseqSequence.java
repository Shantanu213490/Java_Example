package com.neml.java;

import java.util.HashMap;

public class LongConseqSequence {

	public static void main(String[] args) {

		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		int result = GetSequence.longestConsecutive(nums);
		System.out.println(result);
	}

}
class GetSequence {
    public static int longestConsecutive(int[] nums) {
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for(int i=0;i<nums.length;i++) { 		
    		map.put(i,nums[i]);
    	}
		return 0;
        
    }
}