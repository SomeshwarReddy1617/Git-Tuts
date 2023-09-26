package com.eclature;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 boolean leap = Year.isLeap(Long.parseLong("2024"));
		 
		String strNum = "*/10";
		 
		 double parseDouble = Double.parseDouble(strNum);
		
		 
		 LocalDateTime nextRunDateTime = LocalDateTime.of(2022, Month.APRIL, Integer.parseInt("14"),
					Integer.parseInt("4"), Integer.parseInt("12"), Integer.parseInt("22"));
		 
		 System.out.println(parseDouble);

	}

}
