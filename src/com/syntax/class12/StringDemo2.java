package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
			
		String firstName = "Adem";	
		String lastName = " Jones";
		String fullName = firstName+lastName;			//Always ALWAYS use this
		String fullName2 = firstName.concat(lastName);	//Never use this because it can lead to null pointer exception
		System.out.println(fullName2);
		System.out.println(fullName);
		
		String name=""; 
		System.out.println(name.isEmpty());
			
		// NEXT METHOD "TRIM"
		
		String str = " never ";
		System.out.println(str.trim());
		
		
		
	}

}
