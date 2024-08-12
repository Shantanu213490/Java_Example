package com.neml.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ExampleOfList {

	public static void main(String[] args) {

		ArrayList<Character> list1 = new ArrayList<>(Arrays.asList('a','b','c'));
        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList('a','h','b','g','d','c'));

        // Display original lists
        System.out.println("Original list1: " + list1);
        System.out.println("Original list2: " + list2);

        // Retain only the elements present in list2 in list1
        boolean modified = list2.retainAll(list1);

        // Display the modified list1 and whether it was modified
        System.out.println("Modified list2: " + list2);
        System.out.println("Was list1 modified? " + modified);

     
	}

}
