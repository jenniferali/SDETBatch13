package com.syntax.reviewclass2;

public class OperatorsDemo {

	public static void main(String[] args) {
		// Arithmetic operators in java + - / * % 
		// Logical operators: == != >= <= > < 
		
		int num=10;
		int num2=10;
		System.out.println(num+num2);
		System.out.println(num>num2); //num>num2=>f or num=num2=>t
		
		//Whole 0-infinity Negative infinity to Positive infinity
		System.out.println(Long.MAX_VALUE);//(MAX VALUE gives us the max value a certain data type can hold)
		System.out.println((Long.MIN_VALUE));//(MIN VALUE gives us the minimum value a certain data type can hold)
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(num/num2);
		System.out.println(num%num2);
		
		System.out.println(10/3);
		System.out.println(10%3);
		
		System.out.println(10.0/3);
		System.out.println((int)10.0/3);//widening one data type to another data type
		System.out.println(10.5*3);//autowidened to double 
		
		
	}

}
