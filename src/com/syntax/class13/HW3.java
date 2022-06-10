package com.syntax.class13;

public class HW3 {

	public static void main(String[] args) {
		// You have a String a=”Is it Saturday? 
		//Is it raining? Do we have a Java Class today?”
		//How would you find out how many sentences are in that String?
		
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		int sentences = a.length() - a.replace("?", "").length();
		
		System.out.println(sentences+" sentences are in this String.");

	}

}
