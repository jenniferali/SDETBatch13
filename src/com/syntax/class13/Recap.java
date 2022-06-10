package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {
		
		String str = "Batch 23 is great, but I say this to every batch.";
		
		int len= str.length();						//UPPER CASE METHOD
		
		System.out.println(str.toUpperCase());		//You can change str once 
		
		str=str.toUpperCase();						// Or you can change the str variable itself
		
		System.out.println(str);					
		
		str = " "; 									//IS EMPTY METHOD
		System.out.println(str.isEmpty());
		
		String str2 = "Tara              ";
		System.out.println(str2.trim());				//TRIM METHOD
		str= "Batch 23 is great, but I say this to every batch.";
		System.out.println(str.contains("z"));					//CONTAINS METHOD
		
		System.out.println(str.startsWith("Batch")); 		//STARTS WITH METHOD
		
		System.out.println(str.endsWith("ing"));	    // ENDS WITH METHOD
		
	}

}

