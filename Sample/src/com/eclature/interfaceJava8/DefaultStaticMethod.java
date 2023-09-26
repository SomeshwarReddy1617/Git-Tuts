package com.eclature.interfaceJava8;

@FunctionalInterface
public interface DefaultStaticMethod {
	
	public abstract void get();
	
	default void defaultMethod() {
		System.out.println("this is default Method in interface..!");
	}

	static void staticMethod() {
		System.out.println("this is staticMethod in interface...!");
	}
	
}
