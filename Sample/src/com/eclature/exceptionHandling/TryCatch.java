package com.eclature.exceptionHandling;

public class TryCatch {

	public static void main(String[] args) throws TestException {

		System.out.println( devision());
	}

	public static int devision() throws TestException {
		int a = 2, b = 0, c;

		try {
			c = a / b;
			System.out.println("after exception:::");
		} catch (Exception e) {
		System.out.println("catch::::");
			 throw new TestException(e.getMessage());
		}
		return c;
	}
}
