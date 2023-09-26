package com.eclature.HackerEarth;

import java.util.Scanner;

public class Monk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    final Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();
	    
		 if(N%2 != 0) {
	            System.out.println("Weird");
	        }
	        
	        else if(N%2==0 && (N>2 && N<5) ) {
	            System.out.println("Not Weird");
	        }
	        
	        
	      else if(N%2==0 && (N>6&&N<20)) {
	          System.out.println("Weird");
	      }
	      
	      else {
	          System.out.println("Not Weird");
	      }

	}
}
