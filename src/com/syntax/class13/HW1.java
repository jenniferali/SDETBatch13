package com.syntax.class13;

public class HW1 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. 
		//Write a program to get a new String without any spaces.

		String str = "This is an example sentence for homework.";
		
		String str2=str.replaceAll("[a-z0-9]", "");
		
		System.out.println(str.replace(" ", "" ));
		
	}
}
