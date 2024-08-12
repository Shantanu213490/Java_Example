package com.neml.java;

public class RemoveElement {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int result = Solution4.removeElement(nums, val);
		System.out.println("New Length: " + result);
        System.out.print("nums = [");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i]);
            if (i < result - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

	}

}

class Solution4 {
	public static int removeElement(int[] nums, int val) {

        int k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;

	}
}