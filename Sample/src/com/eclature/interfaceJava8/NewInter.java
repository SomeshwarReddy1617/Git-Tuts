package com.eclature.interfaceJava8;

public interface NewInter {

	default void defaultMethod() {
		System.out.println("this is default Method in interface..!");
	}
	
	static void staticMethod() {
		System.out.println("this is staticMethod in interface...!");
	}
}
