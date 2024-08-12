package com.neml.gfgjava;

import java.util.ArrayList;

public class MinDistanceBetweenNum {

	public static void main(String[] args) {

		int n = 4, x = 2, y = 1;
		int[] a = { 1, 2, 3, 2 };
		int result = GetDistanceBetweenNum.minDist(a, n, x, y);
		System.out.println(result);
	}

}

class GetDistanceBetweenNum {
	public static int minDist(int a[], int n, int x, int y) {

//		int result = 0;
//		ArrayList<Integer> ls = new ArrayList<>();
//		for (int i = 0; i < n; i++) {
//			ls.add(a[i]);
//		}
//		if(ls.contains(x) && ls.contains(y)) {
//			System.out.println("ls.indexOf(y) : "+ls.indexOf(y)+ " ,ls.indexOf(x) : " +ls.indexOf(x));
//			 result = Math.abs(ls.indexOf(y) - ls.indexOf(x));
//		}else {
//			System.out.println("x and y is not present in list");
//			return -1;
//		}
//		return result;
		
		int result = Integer.MAX_VALUE;
        int lastIndex = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x || a[i] == y) {
                if (lastIndex != -1 && a[i] != a[lastIndex]) {
                    result = Math.min(result, i - lastIndex);
                }
                lastIndex = i	;
            }
        }
        if (result == Integer.MAX_VALUE) {
            return -1; // Either x or y is not present in the array
        }
        return result;

	}
}