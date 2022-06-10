package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		// SEARCHING FOR INDEX OF WORDS... the spaces before a letter or word
		
		
		String str = "I am always confused";
		
		System.out.println(str.indexOf("am"));
		
		System.out.println(str.indexOf("always"));
		
		System.out.println(str.indexOf('a'));
		
		System.out.println(str.indexOf(' '));
	}

}
