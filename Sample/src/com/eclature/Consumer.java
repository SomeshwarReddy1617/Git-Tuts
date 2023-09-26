package com.eclature;

import java.util.ArrayList;
import java.util.List;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> no = new ArrayList<>();
		no.add(1);
		no.add(4);
		no.add(5);

		//no.stream().forEach(t -> System.out.println(t));
		java.util.function.Consumer<List<Integer>> consumer = ConsumerInterfce::addVal;

		//consumer.accept(no);
         
/*		//Annonymus cls way
		java.util.function.Consumer<String> con = new java.util.function.Consumer<String>() {
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
		con.accept("hello wrold!");
	}*/
		/*//using lambda expression
		java.util.function.Consumer<String> con = (t) -> System.out.println(t);
		con.accept("hello wrold!");*/
		
		/*//using stream api in java 8
		no.stream().forEach(t->System.out.println(t));*/
		
		
	}	
}

class ConsumerInterfce {

	public static void addVal(List<Integer> list) {

		int sum = list.stream().mapToInt(Integer::intValue).sum();

		System.out.println(sum);
	}
}
