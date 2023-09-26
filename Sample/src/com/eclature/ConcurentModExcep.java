package com.eclature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurentModExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println(num);
		
		Iterator<Integer> iterator = num.iterator();
	
		/*	while(iterator.hasNext()) {
			Integer next = iterator.next();
			if(next.equals(3)) {
				iterator.remove();
			System.out.println(num);
		}
		}*/
		for(Integer no : num) {
			if(no == 1) {
				num.remove(no);
			}
			System.out.println(no);
		}
 
	}

}
