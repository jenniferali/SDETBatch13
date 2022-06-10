package com.syntax.class12;

public class StringDemo1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = new String("Oleg"); 	//THIS is the proper way of creating an object from a class. 
		
		String name2= "Oleg";				//This was created by Java programmers to make a shortcut but is the same as above.
		
		// All the classes in Java can be treated as a data type.
		// If a class is present inside the same package or if a class belongs to java.lan package
		
		
		System.out.println(name.length());	//anything with parenthesis inside par is a "Method" 
		name2=" Zameer ";						// .length() also counts spaces! 
		System.out.println(name2.length());
		
		String name3="Oleg";
		System.out.println(name3.length());
		
		String captain="NAVEED";
		System.out.println(captain.toLowerCase());    //converts to lower case
		
		captain="i love java";
		System.out.println(captain.toUpperCase());
		
	}

}
