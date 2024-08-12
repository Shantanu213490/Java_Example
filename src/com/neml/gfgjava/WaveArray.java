package com.neml.gfgjava;

public class WaveArray {

	public static void main(String[] args) {

		int n = 5;
		int arr[] = { 1, 2, 3, 4, 5 };
		GetWaveOfAnArr.convertToWave(n, arr);

	}

}

//class GetWaveOfAnArr {
//	public static void convertToWave(int n, int[] a) {
//
////		for (int i = 0; i < n - 1; i += 2) {
////			int temp = a[i];
////			a[i] = a[i + 1];
////			a[i + 1] = temp;
////		}
//	}
//}

class GetWaveOfAnArr {
public static void convertToWave(int n, int[] a) {
    for (int i = 0; i < n - 1; i++) {
        // Check if index is even and current element is smaller than next element
        if (i % 2 == 0 && a[i] < a[i + 1]) {
            swap(a, i, i + 1);
        }
        // Check if index is odd and current element is larger than next element
        else if (i % 2 != 0 && a[i] > a[i + 1]) {
            swap(a, i, i + 1);
        }
    }
}
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

// Utility method to swap elements at given indices in the array

