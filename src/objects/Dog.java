package objects;

public class Dog {
	
	//attributes of the how the objects looks 
		String name; 
		int age; 
		double weight;
		String color;
		double height;
		String breed;
	//how the object behaves
		void bark() {
			System.out.println("Dog barks");
		}
		void walks() {
			System.out.println("Dog walks");
		
		}void eat() {
			System.out.println("Dogs like to eat bones");
	}
		public static void main(String[] args) {
			//Scanner scan=new Scanner(System.in);
			//scanner.next();
			
			Dog jimmy = new Dog(); //creating an object and storing in a variable
			jimmy.name="Jimmy";
			jimmy.age=6;
			jimmy.weight=16;
			jimmy.color="pink";
			jimmy.height=2.6;
			jimmy.breed="German";
			jimmy.bark();
			//new Dog() how we create an object
	 
 }
}
