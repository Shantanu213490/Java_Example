package com.neml.java;

public class ProdOfArrExceptSelf {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		int[] result = GetProduct.productExceptSelf(nums);
		System.out.print("[");
		for (int i = 0; i < result.length; i++) {
			if (i == result.length - 1) {
				System.out.print(result[i] + "]");
			} else {
				System.out.print(result[i] + ",");
			}
		}

	}

}

class GetProduct {
	public static int[] productExceptSelf(int[] nums) {
		
		int n = nums.length;
		System.out.println(n);
        int[] result = new int[n];
        int productBefore = 1;
        for (int i = 0; i < n; i++) {
            result[i] = productBefore;
            productBefore *= nums[i];
            System.out.print(result[i] + " ");
        }
        
        int productAfter = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= productAfter;
            productAfter *= nums[i];
        }
        
        return result;

	}
}

//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//		
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]