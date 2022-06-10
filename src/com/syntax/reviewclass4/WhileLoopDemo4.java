package com.syntax.reviewclass4;

import java.util.Scanner;

public class WhileLoopDemo4 {

	public static void main(String[] args) {
		
		//take input using scanner, increment by 2, print it
		//if value is 10 terminate the program
	
		int x=0;
		Scanner scan=new Scanner(System.in);
		while(x!=10) {
			System.out.println("Please enter a number");
		x= scan.nextInt();
		System.out.println(x+2);
		}
		scan.close();
	}

}
