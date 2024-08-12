package com.neml.gfgjava;

public class SqrtOfNumber {

	public static void main(String[] args) {

		long x = 5;
		long result = GetSqrtOfNum.floorSqrt(x);
		System.out.println(result);
	}

}

class GetSqrtOfNum {
	public static long floorSqrt(long x) {

		long sq = (long) Math.sqrt(x);
		return sq;

	}
}