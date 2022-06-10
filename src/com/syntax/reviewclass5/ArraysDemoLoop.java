package com.syntax.reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemoLoop {

	public static void main(String[] args) {

		String[] names = new String[5]; // creates an empty array (size 5)to store String type values
		/*
		 * names [0] = "Ahmed"; //stores Ahmed in first box (0) names [1] = "Kaiser";
		 * names [2] = "Abdulsamad"; names [3] = "Zameer"; names [4] = "Elisa";
		 */
		// names [5]= will create an "Error"; because the array only goes til 4: (0 1 2 3 4)

		Scanner scan = new Scanner(System.in);
		/*
		*names[0] = scan.next();		//replaced by for loop below 
		*names[1] = scan.next();
		*names[2] = scan.next();
		*names[3] = scan.next();
		*names[4] = scan.next();
		*/
		
		
		for (int i=0; i<names.length; i++) {
			names[i]=scan.next();
		}

		System.out.println(Arrays.toString(names)); // prints the value of array without loop
	}

}
