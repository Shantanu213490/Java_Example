package com.neml.gfgjava;

public class RotateAnArray {

	public static void main(String[] args) {

		int n = 5, d = 2, arr[] = { 1, 2, 3, 4, 5 };
		GetArrayAfterRoatation.rotateArr(arr, d, n);
	}

}

class GetArrayAfterRoatation {

	static void rotateArr(int arr[], int d, int n) {
		reverse(arr, 0, d - 1); // Reverse the first d elements
		reverse(arr, d, n - 1); // Reverse the remaining elements
		reverse(arr, 0, n - 1); // Reverse the whole array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// Function to reverse the elements of the array within the specified range
	static void reverse(int arr[], int start, int end) {
		while (start < end) {// 1 2 3 4 5
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}

//		int temp[] = new int[d];
//		for (int i = 0; i < d; i++) {
//			temp[i] = arr[i];
//		}
//		for (int i = 0; i < n - d; i++) {
//			arr[i] = arr[i + d];
//		}
//		for (int i = 0; i < d; i++) {
//			arr[n - d + i] = temp[i];
