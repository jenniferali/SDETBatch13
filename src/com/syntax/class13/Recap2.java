package com.syntax.class13;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Where is Sameer?";
		
		System.out.println(str.charAt(3));				//Prints 3rd character (AT) 
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("e"));
		
		System.out.println(str.indexOf("r",5));	     	//Start search after letter 3 
		
		int counter = 0; 
		for (int i = 0; i<str.length(); i++) {
			
			if (str.charAt(i)=='e') {
				System.out.print(i+" ");
				counter++;
				if (counter == 4)
				System.out.println(i);
				
			}
		}
			
	}

}
