package com.syntax.class14;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String ("hahaha");
		System.out.println(s.toUpperCase());
		
		StringBuilder st = new StringBuilder ("jajaja");
		System.out.println(st.reverse());
		
		//String and StringBuilder both are classes that we can use to store and manipulate characters
		//But String is immuteable (unchangeable) and StringBuilder is muteable (changeable)
		//When we make a lot of changes to a String it creates multiple copies inside your memory and 
		//because of this reason for every change a new variable is created
		

	}

}
