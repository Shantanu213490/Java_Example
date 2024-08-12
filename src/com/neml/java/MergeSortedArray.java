package com.neml.java;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		int nums1[] = { -1, 0, 0, 3, 3, 3, 0, 0, 0 };
		int nums2[] = { 1, 2, 2 };
		int m = 6, n = 3;
		int[] result = GetSortedArray.merge(nums1, m, nums2, n);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

class GetSortedArray {

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

		int index = -1;
		for (int i = 0; i < m + n; i++) {

			if (i == m) {

				index = i;
				break;
			}

		}
		for (int i = 0; i < n; i++) {

			if (index != -1) {

				nums1[index] = nums2[i];
				index++;

			}
		}

		Arrays.sort(nums1);
		return nums1;
	}
}