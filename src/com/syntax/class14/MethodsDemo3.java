package com.syntax.class14;

public class MethodsDemo3 {

	public static void main(String[] args) {
		// Write a method that takes an integer value if that value is even
		// this method returns true otherwise it returns false

		MethodsDemo3 md = new MethodsDemo3();
		System.out.println(md.isEven(5));
		System.out.println(md.checkString("Happypup")); // This has 8 characters (even #) so printout is "true"

	}

	boolean isEven(int number) {

		if (number % 2 == 0) {
			return true;

		} else {
			return false;

		}
	}
	
	// Write a method that takes a String and returns true if number of
	// characters in that String are even otherwise if odd returns false

	boolean checkString(String str) {

		if (str.length() % 2 == 0) {
			return true;

		} else {
			return false;

		}

	}

}
