package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {
		//From a String get the part between # and #
		String str= "I am #confused#"; 
		System.out.println(str.substring(5));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
		System.out.println(str.substring(6,14));
		System.out.println(str.substring(0,1));
		
		str="Asghar is great";
		
		System.out.println(str.substring(0,6));
		

	}

}
