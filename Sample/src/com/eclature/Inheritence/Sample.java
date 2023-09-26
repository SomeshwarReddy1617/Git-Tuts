package com.eclature.Inheritence;

import java.util.HashMap;
import java.util.Map;

public class Sample {
	
	public static void main(String args[]) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "abc");
		m.put(2, "xyz");
		
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

}
