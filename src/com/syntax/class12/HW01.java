package com.syntax.class12;

public class HW01 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.

		String goal = "I want to get a great job and salary.";

		int midChar = 0;

		if (!goal.isEmpty()) {

			if (goal.length() % 2 == 1 && goal.length() > 3) {

				midChar = (goal.length() / 2 - 1);

				System.out.println(goal.charAt(midChar));
			}
			
		} else {
			
			System.out.println("Empty String");

		}
	}
}