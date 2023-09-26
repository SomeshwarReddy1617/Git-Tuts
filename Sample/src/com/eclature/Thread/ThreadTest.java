package com.eclature.Thread;

public class ThreadTest extends Thread{
	
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		t.start();
		t.start();
	}

	public void run() {
		System.out.println("running state...");
	}
}
