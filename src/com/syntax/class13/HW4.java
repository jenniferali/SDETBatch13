package com.syntax.class13;

public class HW4 {

	public static void main(String[] args) {
		//  How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
		
		StringBuilder str = new StringBuilder("This is the sentence I want to reverse.");
		
		str.reverse();
		
		System.out.println(str);
		
	}
	

}
