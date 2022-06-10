package com.syntax.reviewclass5;

import java.util.Arrays;
import java.util.Scanner; 

public class ArraysDemo3 {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int size=scan.nextInt(); 				//asks for the size of the array
		
		String [] names = new String [size];		//an array of strings of that size is created
		
		for (int i=0; i<names.length; i++) {
			
			names [i] =scan.next();				//fill the array with the input from the user
		}
		System.out.println(Arrays.toString(names)); 
		
	}

}
