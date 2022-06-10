package com.syntax.class13;

public class HW6 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?
		
		String str = "This is the 1st String.";
		
		String str2 = "This is the 2nd String.";
				
		System.out.println(str+" "+str2);		
		
		str=str+str2;
		
		str2= str.substring(0,str.length()-str2.length());
		
		str = str.substring(str2.length());
		
		System.out.println("Swap: "+str+" "+str2);
		
	}

}

