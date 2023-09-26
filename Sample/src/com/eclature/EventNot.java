package com.eclature;

import java.util.ArrayList;
import java.util.List;

public class EventNot {

	private List<Student> stu = new ArrayList<Student>();
	private List<Student1> stu1 = new ArrayList<Student1>();

	public List<Student1> getStu1() {
		return stu1;
	}

	public void setStu1(List<Student1> stu1) {
		this.stu1 = stu1;
	}

	public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "EventNot [stu=" + stu + ", stu1=" + stu1 + "]";
	}

}
