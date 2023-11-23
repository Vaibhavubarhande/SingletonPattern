package com.singleton;

public class Calculate {

	/**
	 * This is singleton class and you cannot create object using new keyword You
	 * can use getInstance method to create an object
	 * 
	 * @author Administrator
	 */
	private static Calculate c;

	private Calculate() {

	}

	static {
		
		c = new Calculate();
	}

	public static Calculate getInstance() {
		
		return c;
	}

	public boolean isPalindrome(int number) {

		int rev = 0;
		int rem = 0;
		int temp = number;
		while (temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (number == rev)
			return true;
		else
			return false;
	}

	public void isPalindrome(String s) {

	}

	public boolean isprime(int number) {

		int count = 0;
		for (int i = 1; i < number / 2; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count > 2)
			return false;
		else
			return true;
	}
}
