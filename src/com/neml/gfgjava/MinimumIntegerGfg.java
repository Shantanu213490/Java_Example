package com.neml.gfgjava;

import java.util.HashMap;

public class MinimumIntegerGfg {

	public static void main(String[] args) {

		int N = 3;
		int[] A = { 1, 3, 2};
		int result = GetMinimumInt.minimumInteger(N,A);
		System.out.println(result);
	}

}
class GetMinimumInt {
    public static int minimumInteger(int N, int[] A) {
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for(int i:A) {
    		map.put(i, A[i]);
    	}
    	
		return N;
    }
}