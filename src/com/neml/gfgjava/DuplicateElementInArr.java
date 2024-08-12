package com.neml.gfgjava;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateElementInArr {

	public static void main(String[] args) {

		int n = 4;
		int arr[] = { 2, 0, 3, 3 };
		ArrayList<Integer> result = GetListOfElements.duplicates(arr, n);
		System.out.println(result);

	}

}

class GetListOfElements {
	public static ArrayList<Integer> duplicates(int arr[], int n) {

		ArrayList<Integer> result = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int a:arr) {
			map.put(a, arr[a]);
		}
		System.out.println(map);
	

		return result;

	}
}