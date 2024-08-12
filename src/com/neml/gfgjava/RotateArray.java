package com.neml.gfgjava;

public class RotateArray {

	public static void main(String[] args) {

		int n = 7, d = 3;
		int arr[] = { 1, 2, 3, 4, 5, 9 ,5 };
		GetRotatedArray.rotateArr(arr, d, n);
	}

}

class GetRotatedArray {
    static void rotateArr(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+ " ");
        }
    }
}
