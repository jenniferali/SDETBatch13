package com.syntax.reviewclass5;

public class BreakDemo1 {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			
			if (i> 2) {
				break; 					// "breaks" the loop
			}
			System.out.println("Zameer the Break Manager");
		}
		System.out.println("We are done looping");
	}

}
