package com.neml.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CheckOddNumPresentInList {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6);
		ls = new ArrayList<>(ls);
		Iterator<Integer> it = ls.iterator();
		while (it.hasNext()) {

			int rem = it.next();
			if (rem % 2 == 0) {
				it.remove();
			}

		}
		System.out.println(ls);
	}

}
