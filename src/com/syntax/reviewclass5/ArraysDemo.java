package com.syntax.reviewclass5;

public class ArraysDemo {

	public static void main(String[] args) {
		// should create an array with these elements
		String name  = "Oleg";
		String name2 = "King"; 
		String name3 = "Mumtaz";
		
		//should not create an array with these elements
		String city = "New York";
		String country = "USA";
		String continent = "North America";
		
		//2 diff ways to create an array
		String [] names = {"Oleg", "King", "Mumtaz"};
		
		//another way
		String [] names2 = new String [3];
		names2[0] = "Oleg";			//Stores Oleg in 1st postion
		names2[1] = "King";			//Stores King in 2nd
		names2[2] = "Mumtaz"; 
		

	}

}
