package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {

	// What is a Method? A "Method" is a block of code, a group of Java statements
	// that are grouped together
	// and we can execute those statements by just creating an object of the class
	// that contains that method and by writing the objects name.method name

	// Void is a method that does not return value, 
	void printHello() {
		System.out.println("How are you guys?");
	}
	//Method that returns something:
	// Always starts with DATATYPE like below (boolean)
	boolean returnTrue() {
		return true; 
	}
	 int returnInt() {
		 return 10; 
	 }
	
	
	public static void main(String[] args) {
		
		// Method that doesn't return something
		MethodsDemo md = new MethodsDemo();
		md.printHello();
		
		boolean xs = md.returnTrue();
		
		int num=md.returnInt();
		System.out.println(num);
		System.out.println(md.returnInt());

		// Method that doesn't return something
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

	}
}
