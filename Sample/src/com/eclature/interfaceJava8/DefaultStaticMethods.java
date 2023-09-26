package com.eclature.interfaceJava8;

public class DefaultStaticMethods implements DefaultStaticMethod, NewInter {

	public static void main(String[] args) {
		DefaultStaticMethod id = new DefaultStaticMethods();
		id.defaultMethod();

		DefaultStaticMethod.staticMethod();
		
	}

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		DefaultStaticMethod.super.defaultMethod();
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}
	
	
}
