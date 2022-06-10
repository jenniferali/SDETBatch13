package com.syntax.reviewclass4;

public class ForLoopOrderExecution {

	public static void main(String[] args) {
		
//ORDER OF EXECUTION IN JAVA
		int x=0;
		
		for (System.out.println("1"); x<10; System.out.println("3")) {
			System.out.println("4");
			x++;
		}
		
		
		
	}

}
