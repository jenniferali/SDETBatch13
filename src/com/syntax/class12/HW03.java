package com.syntax.class12;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		// Write a program that reads two people's first
		// names and if they expecting boy or girl?

		Scanner scan = new Scanner(System.in);

		System.out.println("Input mom's 1st name...");
		String momName = scan.next();

		System.out.println("Input dad's 1st name...");
		String dadName = scan.next();

		System.out.println("Are you expecting a girl or boy?");
		String babyGender = scan.next();

		String momName2 = momName.substring(0, 3);
		String momName3 = momName.substring(3, 6);

		String dadName2 = dadName.substring(3, 6);
		String dadName3 = dadName.substring(0, 3);

		if (babyGender.equalsIgnoreCase("girl")) {
		System.out.println("Your suggested baby name is: " + momName2 + dadName2);
		
		}else if (babyGender.equalsIgnoreCase("boy")) {
			System.out.println("Your suggested baby name is: " + dadName3 + momName3);
		}	
	}
}

