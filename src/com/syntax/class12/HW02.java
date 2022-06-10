package com.syntax.class12;

public class HW02 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).

		String funDay = "Sunday";

		for (int i = funDay.length() - 1; i >= 0; i--) {

			System.out.print(funDay.charAt(i));
		}
	}
}

