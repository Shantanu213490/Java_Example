package com.neml.java.collections;

import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;

public class VectorExample {

	public static void main(String[] args) {

		Vector<String> vc = new Vector<>(10);

		System.out.println("Capacity of vector is " + vc.capacity());

		vc.ensureCapacity(25);

		System.out.println("Capacity of vector is " + vc.capacity());

		vc.addElement("XYZ");
		vc.addElement("ABC");
		vc.addElement("MNO");
		vc.addElement("RST");
		vc.addElement("UVW");

		Iterator<String> it = vc.iterator();
		Predicate<String> pr = s -> s.equals("RST");

		vc.removeIf(pr);

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
