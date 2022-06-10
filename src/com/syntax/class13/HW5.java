package com.syntax.class13;

public class HW5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? aba=> true
		// Abbc =>false

		String str = "aba";
		String str2 = "Abbc";

		StringBuilder rev = new StringBuilder(str).reverse();

		String strRev = rev.toString();
		if (str.equalsIgnoreCase(strRev)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		StringBuilder rev2 = new StringBuilder(str2).reverse();

		String strRev2 = rev2.toString();
		if (str2.equalsIgnoreCase(strRev2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
