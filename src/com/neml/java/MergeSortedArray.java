package com.neml.java;

public class MergeSortedArray {
	
	 public static void main(String[] args) {
		 
		 int nums1[] = {1,2,3,0,0,0};
		 int nums2[] = {2,5,6};
		 int m = 3, n = 3;
		 merge(nums1, m, nums2, n);
	 }
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	       
		 int[] arr = new int[nums1.length+nums2.length];
		 int count=0;
		 for(int i=0;i<nums1.length;i++) {
			 arr[count] = nums1[i];
			 count++;
		 }
		 for(int i=0;i<nums2.length;i++) {
			 arr[count] = nums2[i];
			 count++;
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+ " ");
		 }
	    }
	

}
