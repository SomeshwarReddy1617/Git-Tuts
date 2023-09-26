package com.eclature.Inheritence;

public class SuperClsTest {
	int id;
	String name;
	int no=1;
	
	public void gett() {
		System.out.println("this is get method");
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
		return "SubCls [id=" + id + ", name=" + name + "]";
	}
	

}
