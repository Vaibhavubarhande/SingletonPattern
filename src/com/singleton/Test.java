package com.singleton;

public class Test {
	/**
	 * 
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Calculate c1 = Calculate.getInstance();
		Calculate c2 = Calculate.getInstance();
		
		boolean x = c1.isPalindrome(343);
		boolean y = c1.isprime(6);
		
		System.out.println(x);
		System.out.println(y);
		
	if(c1==c2) {
		System.out.println("Equal");
		
	}else {
		System.out.println("Not equal");
	}
		
	}
}
