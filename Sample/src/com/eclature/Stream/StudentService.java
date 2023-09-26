package com.eclature.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

	public static void main(String[] args) {

		///System.out.println(getSorted());
		//System.out.println(getFilter("tax1"));
		System.out.println(getMap());
	}

	private static List<Student> getSorted() {

		return new Repo().getStudent().stream().sorted(Comparator.comparing(Student::getRoll))
				.collect(Collectors.toList());
	}

	private static List<String> getMap() {
		// TODO Auto-generated method stub
		return new Repo().getStudent().stream().map(s -> s.getName()).collect(Collectors.toList());

	}

	public static List<Student> getFilter(String input) {
		return (input == "tax")
				? new Repo().getStudent().stream().filter(t -> t.getRoll() > 5).collect(Collectors.toList())
				: new Repo().getStudent().stream().filter(t -> t.getRoll() <= 5).collect(Collectors.toList());
	}
}
