package com.eclature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparaterCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Servise().bookSorting();
		//System.out.println(new Servise().bookSorting());
	}

}

class Servise {
	public List<Book> bookSorting() {
		List<Book> books = new Repo().bookRepo();

		//Collections.sort(books, new MyComparator());
		
		Comparator<Book> comparing = Comparator.comparing(Book::getName).reversed();
		Collections.sort(books, comparing);
		for(Book b : books) {
			System.out.println(b);
		}
		//Collections.sort(books, (o1, o2) -> o1.getName().compareTo( o2.getName() ) );
		
		return books;
	}
}

class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getId() == o2.getId()) {
			return 0;
		}
		if (o1.getId() > o2.getId()) {
			return 1;
		}
		if (o1.getId() < o2.getId()) {
			return -1;
		}
		return 0;
	}
}
/*
class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		return o2.getName().compareTo(o1.getName());
	}

}
*/
class Repo {

	public List<Book> bookRepo() {

		List<Book> books = new ArrayList<>();
		books.add(new Book(3, "xyz"));
		books.add(new Book(2, "sample"));
		return books;
	}
}

class Book {

	int id;
	String name;

	public Book(int i, String name) {
		this.id = i;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}

}