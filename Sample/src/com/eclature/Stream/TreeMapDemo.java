package com.eclature.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();
		map.put(100, "Amit");
		map.put(106, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		map.put(108, "Amit");
		map.put(109, "Ravi");
		map.put(102, "Vijay");
		map.put(111, "Rahul");
		
		List<Map.Entry<Integer, String>> l = new ArrayList<>(map.entrySet());

		//Collections.sort(l, Comparator.comparing(Map.Entry.comparingByValue()));
		
		System.out.println(map);
		System.out.println();
		l.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}

}
