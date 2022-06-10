package com.syntax.class14;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I never forget about recording.";
		
		System.out.println(str.replace("never", "always").replace("I", "Asghar"));
		
		str= "kagnSrger5261566414894gsgnoergnprmg";
		
		System.out.println(str.replaceAll("[0-9]", ""));
		
		String str2 = "Batch 13 is great. Batch 13 is Best. Batch 13 is excellent";		
		String [] arr=str2.split("[.]"); 	//Splits sentences in a string 
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		str = "We #love Java";
		String[]arr2=str.split("[#]");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		
	}

}
