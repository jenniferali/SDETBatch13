package com.syntax.reviewclass3;

public class IfElse {

	public static void main(String[] args) {
		
		String user = "Asghar";
		
		String password = "pass123"; 
		// whenever we use primitive data types like byte short int long float double char boolean
		//we use ==
		// whenever we use non=primitive data types we use .equals method (String)
		// we use equals.method
		
		if (user.equals("asghar") && password.equals("pass123")) {
			System.out.println("Welcome back to Syntax");
			
		}else {
			System.out.println("username of password is not correct");
		}
		//  When debugging make sure you have 
		// not disabled the breakpoint
		// you have not enabled the "skip all breakpoints" option in debug window
	}

}
