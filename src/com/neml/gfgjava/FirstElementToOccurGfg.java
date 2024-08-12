package com.neml.gfgjava;

public class FirstElementToOccurGfg {

	public static void main(String[] args) {

		int n = 7, k = 2;
		int a[] = { 1, 7, 4, 3, 4, 8, 7 };
		int result = GetOccuredElement.firstElementKTime(n, k, a);
		System.out.println(result);
	}

}

class GetOccuredElement {
	public static int firstElementKTime(int n, int k, int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
 
			int occur = a[i];
			for (int j = 1; j < a.length - 1; j++) {
				if (a[i] == a[j]) {
					count++;
					if (count == k) {
						return a[j];
					}
				}
			}
		}

		return k;
	}
}
