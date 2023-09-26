package com.eclature.Date;

import java.util.Scanner;

class He {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no of grids::: ");
		int nextInt = sc.nextInt();
		
		System.out.println("housees::");
		
		String next = sc.next();
		
		if(next.contains("HH")) {
			System.out.println("NO::::");
		}
		else {
			System.out.println("YES:::");
			
		next= 	next.replace('.', 'B');
		
		System.out.println(next);
		}
	}
}