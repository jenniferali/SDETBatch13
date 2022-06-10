package com.syntax.reviewclass2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your age"); 
		int age=scanner.nextInt();  
		
		String newLine= scanner.nextLine();// next line is a special method  
		 									//this clears the buffer box that "int" is stored in
											// consumes the "enter" that user presses after the number
		System.out.println("Please Enter your name");
		String name=scanner.nextLine();// 
		
		System.out.println(name+" "+age);

	}

}
//int. boolean. double GOES BEFORE STRING (nextLine method)