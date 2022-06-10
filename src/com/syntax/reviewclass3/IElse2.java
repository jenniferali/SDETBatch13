package com.syntax.reviewclass3;

public class IElse2 {

	public static void main(String[] args) {
		
		// When code executes but does not produce expected results
		// we call these logical errors
		
		//When code does not even execute, we call these mistakes syntax errors
		
		// in non primitive type variables we can store 'null" which means nothing
		
		// if we need to test multiple conditions w go with else if conditions
		
		//IF ELSE IF is more efficient and takes less time to execute
		
		String day= "Monday";
		
		if (day.equals("Monday")) {
			System.out.println("weekday");
			
		}else if ("Tuesday".equals(day)) {
			System.out.println("weekday");
		}else if ("Wednesday".equals(day)) {
			System.out.println("weekday");
		}else if ("Thursday".equals(day)) {
			System.out.println("weekday");
		}else if ("Friday".equals(day)) {
			System.out.println("weekday");
		}else if ("Saturday".equals(day)) {
			System.out.println("weekday");
		}else if ("Sunday".equals(day)) {
			System.out.println("weekday");
	}
       // if if if makes a slower execution and less efficient

	if (day.equals("Monday")) {
		System.out.println("weekday");
	}
	if ("Tuesday".equals(day)) {
		System.out.println("weekday");
	}
	if ("Wednesday".equals(day)) {
		System.out.println("weekday");
	}
	
	// LOGICAL CAN ALSO BE MORE EFFICIENT
	
	if (day.equals("Monday")||"Tuesday".equals(day)||"Wednesday".equals(day) ||"Thursday".equals(day)||"Friday".equals(day)) {
			System.out.println("weekday");
			
		}else if ("Saturday".equals(day)||"Sunday".equals(day)) {
			System.out.println("Weekend");
		}else {
			System.out.println("Not a valid day");
		}
}}
