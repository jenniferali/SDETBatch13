package com.syntax.reviewclass6;

public class School {

	public static void main(String[] args) {
	
		Student student1 = new Student ();
		//ACCESSING VARIABLES OF STUDENT CLASS
		student1.name = "Samira";
		student1.lastName = "Pashayeva";
		student1.address = "Virginia";
		
		student1.studentId = 101;
		student1.age = 25; 
		student1.grade = 'A';
		
		//Subject cannot be resolved or is not a field
		// (It's not defined!)
		//--------> student1.subject="Java";
		
		Student student2 = new Student ();
		//ACCESSING VARIABLES OF STUDENT CLASS
		
		student2.name = "Omid";
		student2.lastName = "Mahmoodi";
		student2.address = "California";
		student2.age = 18; 
		student2.studentId = 102;
		student2.grade = 'A';
	
		//ACCESSING METHODS OF STUDENT CLASS
		student2.study();
		student2.doHomework();
		
		System.out.println("-----------------------");
		
		student1.study();
		student1.doHomework();
		
		String fullName=student1.getFullName();
		System.out.println(fullName);
		
		System.out.println(student2.getFullName());
	
		 student1.printInfo();
		 student2.printInfo();
		 
		student1.takeSubject("Java");
		student2.takeSubject("Biology");
}
}
