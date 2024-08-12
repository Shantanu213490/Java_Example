package com.neml.java.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		
		List<String> lsIndes = Arrays.asList("abc","defg","hijkl","mnopqr");
		
		System.out.println("String before sorting : ");
		
		Collections.sort(lsIndes,new LengthComparator());
		
		Iterator<String> it = lsIndes.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
class LengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		
		return Integer.compare(o2.length(),o1.length());
	}
	
}


