package com.practice;

public class B {

	public static void main(String[] args) {

		A a1 = A.getInstance();
		A a2 = A.getInstance();

		if (a1==a2) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
