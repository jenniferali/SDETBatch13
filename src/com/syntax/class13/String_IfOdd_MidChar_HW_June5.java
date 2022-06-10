package com.syntax.class13;

public class String_IfOdd_MidChar_HW_June5 {

	public static void main(String[] args) {
		
		//Create a String and if the String is not empty perform the following: 
			//if the String has an odd number of characters and has 3 or more 
		//characters, print the character in the middle of the String.
		
		String str = new String ("Hello");	// THIS WAY IS NOT PREFERED
		String str2= "Hello";                //THIS WAY OF CREATING STRING IS PREFERRED
		
		if (!str2.isEmpty()) {
			
			if (str2.length()%2!=0 && str.length()>=3) {	// %2!=0 is best for odd number calculation
																	//NOT %2=1
				int middle = str2.length()/2;
				
				System.out.println(str2.charAt(middle));
				
			}
		}

	}
	
}

