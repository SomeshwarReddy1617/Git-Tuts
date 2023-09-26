package com.eclature.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repo {

	public List<Student> getStudent() {

		List<Student> l = new ArrayList<>();
		l.add(new Student(1, "a", 5));
		l.add(new Student(1, "b", 9));
		l.add(new Student(3, "c", 1));
		l.add(new Student(4, "d", 12));

		return l;
	}

}
