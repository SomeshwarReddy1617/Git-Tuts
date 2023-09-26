package com.eclature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> test =new HashMap<>();
		test.put(1, "abc");
		test.put(2, "def");
		test.put(3, "ghi");
		
		test.forEach((key,value)-> System.out.println(key + ":" + value)); 
		System.out.println();
		
		test.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t-> System.out.println(t));
		
		List<String> names = new ArrayList<>();
		names.add("somesh");
		names.add("surya");
		names.add("xyz");
		System.out.println();
		names.stream().filter(t->t.endsWith("a")).forEach(c->System.out.println(c));

	}

}
