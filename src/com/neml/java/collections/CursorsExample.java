package com.neml.java.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsExample {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>(5);
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");
	
		System.out.println(v.capacity());

//		Iterator<String> itr = v.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		ListIterator<String> li = v.listIterator();
//		while(li.hasNext()) {
//			
//			
//			System.out.println(li.next()+ " with Index : " +li.nextIndex());
//			
//		}
//		System.out.println("---------------------------------------------");
//		while (li.hasPrevious()) {
//
//			System.out.println(li.previous()+ " with Index : " +li.previousIndex());
//			
//		}
		
		Enumeration<String> enum1 = v.elements();
		while (enum1.hasMoreElements()) {
			
			System.out.println(enum1.hasMoreElements());

		}
	}

}
