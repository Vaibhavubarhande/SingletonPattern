package com.practice;

public class A {

	private static A a;

	private A() {

	}

	static {
		a = new A();
	}

	public static A getInstance() {

		return a;

	}
}
