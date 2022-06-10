package objects;

public class Car {
	
	String colour;
	String make;
	String model;
	String color;
	int year;
	String typeOfEngine;
	int NoOfDoors;
	int HP;
	
	void moveForward() {
		System.out.println("Car is moving forwad");
	}
	void reverse() {
		System.out.println("It is moving backward");
	}
	public static void main(String[] args) {
		Car bmw=new Car();
		bmw.model="x6";
		bmw.color="Black";
		bmw.year=2022;
		bmw.typeOfEngine="V8";
		bmw.HP=500;
		
		System.out.println(bmw.model);
		
		bmw.moveForward();
		bmw.reverse();
		
		Car lexus=new Car();
		lexus.make="Lexus";
		lexus.model="LX570";
		lexus.color="white";
		//lexus.
}
}
