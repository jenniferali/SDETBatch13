package com.syntax.class14;

public class MethodsDemo2 {
	public static void main(String[] args) {
	

		MethodsDemo2 md = new MethodsDemo2();
		md.print();
		md.printManyTimes(3);
	}
	// Write a method, that when called, prints "Batch 13 is great", 5 times
	
	void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Batch 13 is great!");
		}
	}
	
	
	void printManyTimes(int times) {
		for (int i = 0; i < times; i++)
			System.out.print("Batch 13 is great!");
	}
}
