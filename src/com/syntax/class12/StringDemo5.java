package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		
		
		String str = "Sameer is funny and gulbadan and sheer badan!";
		
		System.out.println(str.charAt(2));

		System.out.println(str.charAt(5));
		
		int counter = 0; 
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			
			if ('s'==str.charAt(i) || 'S'==str.charAt(i)|| 'a'==str.charAt(i) || 'A' ==str.charAt(i)) {
				counter++;
			}
		}
		System.out.println("S and a appeared " +counter+ " in the string");
	}

}
