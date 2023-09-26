package com.eclature.Date;

import java.time.LocalDate;

public class AddDaysToLocaldate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate plusDays = LocalDate.now().plusDays(12);
		System.out.println(plusDays);
		LocalDate plusDays2 = plusDays;
		plusDays2.plusDays(10);
		System.out.println(plusDays2);
		
	}

}
