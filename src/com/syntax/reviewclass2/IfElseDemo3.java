package com.syntax.reviewclass2;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your account balance");
		
		double accountBalance=scanner.nextDouble();
		
		System.out.println("Please enter the amount you want to lend to your buddy");
		
		double amountToLend=scanner.nextDouble();
		
		if (accountBalance>=amountToLend) {
			System.out.println("Yes I can help you");
		}else {
			System.out.println("Sorry I don't have enough money to help you");
		}

	}

}
