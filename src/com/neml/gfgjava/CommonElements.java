package com.neml.gfgjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CommonElements {

	public static void main(String[] args) {

		int n1 = 6, a[] = { 1, 5, 10, 20, 40, 80 };
		int n2 = 5, b[] = { 6, 7, 20, 80, 100 };
		int n3 = 8, c[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
		ArrayList<Integer> result = GetCommElements.commonElements(a, b, c, n1, n2, n3);
		System.out.println(result);
	}

}

class GetCommElements {

	public static ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) {
		HashSet<Integer> a1 = new HashSet<>();
		HashSet<Integer> b1 = new HashSet<>();
		HashSet<Integer> c1 = new HashSet<>();
		
		ArrayList<Integer> ls = new ArrayList<>();

		for (int i = 0; i < n1; i++) {
			a1.add(a[i]);
		}
		for (int i = 0; i < n2; i++) {
			b1.add(b[i]);
		}
		for (int i = 0; i < n3; i++) {
			c1.add(c[i]);
		}
		
		a1.retainAll(b1);
		a1.retainAll(c1);
		ls.addAll(a1);
		Collections.sort(ls);
		return ls;
		

	}
}