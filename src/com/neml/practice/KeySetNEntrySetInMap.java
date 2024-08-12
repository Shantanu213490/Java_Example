package com.neml.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class KeySetNEntrySetInMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Geeks");
		map.put(2, "For");
		map.put(3, "Geeks");

		System.out.println(map);

		System.out.println("----------------------------------------------------");

		for (Entry<Integer, String> i : map.entrySet()) {

			Integer key = i.getKey();
			String value = i.getValue();
			System.out.println(key + "=" + value);

		}
		System.out.println("----------------------------------------------------");
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
