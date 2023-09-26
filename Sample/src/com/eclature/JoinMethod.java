package com.eclature;

class A extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 3; i++) {
			System.out.println(name);
		}
		int count = 1;
		for (int i = 0; i < 3; i++) {
			System.out.println("t1 count ::: " + count);
			count++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("exception");
			}
		}
	}
}

class B extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 3; i++) {
			System.out.println(name);
		}
		int begin = 2;
		for (int j = 0; j < 4; j++) {
			System.out.println("t2 count:::: " + begin);
			begin++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("exception");
			}
		}
	}
}

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 3; i++) {
			System.out.println(name);
		}
		A t1 = new A();

		B t2 = new B();

		t2.start();
		t2.join();
		t1.start();
		t1.join();

		System.out.println("main");

	}

}
