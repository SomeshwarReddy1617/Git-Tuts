package com.eclature.Stream;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now = LocalDate.now();
		
		LocalDate of = LocalDate.of(2022, Month.APRIL, 12).plusDays(10);
		System.out.println("of ::::"+of);
		
		System.out.println("date : "+now);

	}

}
