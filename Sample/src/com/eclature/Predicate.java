package com.eclature;

import java.util.ArrayList;

import java.util.List;

public class Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int temp = 0;

		List<Integer> no = new ArrayList<>();
		no.add(2);
		no.add(4);
		no.add(5);
		
		//using Stream api
		no.stream().filter(t -> t%2 ==0).forEach(t-> System.out.println( t +" is true"));
		
		/*
		 * int sum = no.stream().filter( t -> t%2 == 0
		 * ).mapToInt(Integer::intValue).sum(); System.out.println(sum);
		 */

		/*// Treditional way
		 * pred p = new pred(); for(Integer i : no) { if(p.test(i) == true) {
		 * System.out.println( "no "+i+ p.test(i)); } }
		 */

	/*	//using Annonymus class
	 * java.util.function.Predicate<Integer> p = new java.util.function.Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {

				if (t % 2 == 0)
					return true;
				else
					return false;
			}
		};
		for (Integer i : no) {
			System.out.println(p.test(i));
		}*/
		
		/*//using Lambda expression
		java.util.function.Predicate<Integer> pp = (t) -> {
			if (t % 2 == 0)
				return true;
			else
				return false;
		};
		for (Integer i : no) {
			System.out.println(pp.test(i));
		}*/

	}

}

class pred implements java.util.function.Predicate<Integer> {
	public static void predTest(Integer p) {

	}

	@Override
	public boolean test(Integer no) {
		// TODO Auto-generated method stub

		if (no % 2 == 0) {
			return true;
		} else
			return false;

	}
}