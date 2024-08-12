package com.neml.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NullHandlingComparatorExample {

    public static void main(String[] args) {
        // Create a list of strings with some null values
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add(null);
        stringList.add("Orange");
        stringList.add("Banana");
        stringList.add(null);
        stringList.add("Mango");

        // Use a custom comparator with null handling
        Comparator<String> nullHandlingComparator = Comparator.nullsFirst(Comparator.naturalOrder());

        // Sort the list using the custom comparator
        Collections.sort(stringList, nullHandlingComparator);

        // Print the sorted list
        System.out.println("Sorted List with Nulls Last: " + stringList);
    }
}
