package com.syntax.class13;

public class HW2 {

	public static void main(String[] args) {
		// Create a String that should be combination of 
		//letters, numbers and special characters. 
		//Find out how many Alphanumeric characters are there in the String.
		
		String str = "abcdefghi123456789!@#$%^";
		
		int alpha = str.length() - str.replaceAll("[a-z0-9]","").length();
		
		System.out.println(alpha+" Alphanumeric characters are in this String." );
		
	}
				
}

		
				
