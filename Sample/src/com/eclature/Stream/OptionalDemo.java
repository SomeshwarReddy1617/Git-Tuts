package com.eclature.Stream;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		/*
		 * Student s = new Student(1, null, 12);
		 * 
		 * Optional<Object> empty = Optional.empty(); System.out.println(empty);
		 */
		Optional<Student> s = getS("abc");

		System.out.println(s.map(Student::getName));

	}

	public static Optional<Student> getS(String name) {
		Student s = new Student(2, name, 4);
		return Optional.ofNullable(s);
		// s.getName() != null ? s.getName() : null;
	}
}
