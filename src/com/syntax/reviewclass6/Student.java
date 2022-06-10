package com.syntax.reviewclass6;

public class Student { //PUBLIC STATIC VOID MAIN METHOD MAKES A CLASS EXECUTABLE 
		
		//DEFINE ATTRIBUTES/FIELDS/PROPERTIES = VARIABLES
		
		String name, lastName, address; 
		
		int studentId, age;
		
		char grade; 
		
		//DEFINE BEHAVIOR = METHODS
		
		void study() {
			System.out.println(name+" is studying.");
		}
		
		void doHomework() {
			System.out.println(name+" is doing homework.");
		}
		
		//CREATE A METHOD THAT WILL RETURN FULL NAME OF A STUDENT IN UPPERCASE
		
		String getFullName() {
			return name.toUpperCase()+" "+lastName.toUpperCase();
		}
		
		//CREATE A METHOD TO DISPLAY FULL INFO OF A STUDENT (FULL NAME, AGE, ID, ADDRESS)
		
		void printInfo() {
			System.out.println(name+" "+lastName+" is "+age+" and lives in "+address);
		}
		
		//CREATE A METHOD THAT WILL RETURN WHETHER STUDENT IS GREAT, GOOD, BAD OR AVERAGE
		//BASED ON THE GRADE
		
		String rating() {
			switch (grade) {
			
			case 'A':
				return "great"; 
			case 'B':
				return "good";			
			case 'C':
				return "average";			
			default:
				return "bad";
				
			}
		}
		void takeSubject(String subject) {
			System.out.println(name+" studies "+subject);
		}
	}


