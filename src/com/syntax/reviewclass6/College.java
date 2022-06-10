package com.syntax.reviewclass6;

public class College {

	public static void main(String[] args) {
		Student stu = new Student(); 
		
		stu.name="John";
		stu.lastName="Doe";
		stu.address="New York";
		stu.studentId=199;
		stu.age=45;
		stu.grade='B';
		
		//accessing methods 
		stu.study();
		stu.doHomework();
		stu.printInfo();
	
		//below are  2 methods that have a return type 
		System.out.println(stu.getFullName());
		
		String rating=stu.rating();
		
		System.out.println(stu.name+" is "+rating+" student");
	}

}
