package com.eclature;

import java.util.ArrayList;
import java.util.List;

/*
class Sup implements java.util.function.Supplier<String> {

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "hELLO world!";
	}

}*/

public class Supplier {

	public static void main(String[] args) {
		
		java.util.function.Supplier<String> sup = () -> "hello world";
		
		List<String> no = new ArrayList<>();
	/*	no.add("a");
		no.add("b");
		no.add("c");*/
		
		System.out.println( no.stream().findAny().orElseGet(sup) );
	}

}
