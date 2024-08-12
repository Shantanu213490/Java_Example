package com.neml.java.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingExamples {

	     // ---------------------------Various way to iterate data--------------------------------------//

	public static void main(String[] args) {

		List<String> ls = Arrays.asList("java", "kotlin", "python", "scala", ".net");

		// -----------------------Using for loop-------------------------------------------------------//
		for (int i = 0; i < ls.size(); i++) {

			System.out.println(ls.get(i));

		}

		// -----------------------Using for-each loop--------------------------------------------------//
		for (String s : ls) {

			System.out.println(s);
		}

		// -----------------------Using iterator interface--------------------------------------------//

		Iterator<String> it = ls.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		// -----------------------Using iterator interface-------------------------------------------//
		ListIterator<String> lsIt = ls.listIterator();

		while (lsIt.hasNext()) {

			System.out.println(lsIt.next());
		}
		while (lsIt.hasPrevious()) {

			System.out.println(lsIt.previous());

		}

		// -----------------------Using ForEach-Remaining method------------------------------------//

		Iterator<String> it1 = ls.iterator();
		it1.forEachRemaining(a -> System.out.println(a));

		// -----------------------Using ForEach method---------------------------------------------//

		ls.forEach(a -> System.out.println(a));
	}

}
