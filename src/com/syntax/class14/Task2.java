package com.syntax.class14;

public class Task2 {

	public static void main(String[] args) {
		// Create a String that should be 
		//combination of letters, numbers and special characters. 
		//Find out how many Alphanumeric characters are there in the String
		
		String str = "asdsgh124536!@#$%^";
		
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
							//This replaces all exceptA-Z,etc		This counts the elements in the String
	}

}
