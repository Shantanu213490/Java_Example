package com.neml;

public class AddTwoNumber {
	
	public static void main(String[] args) {
	
	int[] nums= {2,7,11,15,6};
	int target=8;
	int[] result =  twoSum(nums,target);
	System.out.print("[" + result[0] + ", " + result[1] + "]");
	
}

	 public static int[] twoSum(int[] nums, int target) {
		 
		 for(int i=0;i<nums.length;i++) {
			 for(int j=i+1;j<nums.length;j++) {
				 
				 if(nums[i]+nums[j]==target) {
					 return new int[]{i, j};
				 }
			 }
		 }
		return nums;
	        
	    }

}

