package objects;

public class Pup {
		//Create a Dog Class and create 3 different objects of it:
		//Husky, Bulldog, Labrador with specific  attributes and behaviors.
		
		String fur;
		int weightInLbs;
		String eyeColor; 
		String personality; 
		
		void wagsTail() {
			System.out.println("Dogs wag their tail.");
			
		}void barksAtIntruders() {
			System.out.println("Dogs bark at intruders.");
			
		}void whinesForScraps() {
			System.out.println("Dogs whine for scraps.");
			
		}void fetchesToys() {
			System.out.println("Dogs fetch toys.");
		}
		public static void main(String[] args) {
			
			Pup Husky = new Pup(); 
			Husky.fur = "agouti fur";
			Husky.weightInLbs = 50;
			Husky.eyeColor = "icy blue";
			Husky.personality = "playful";
			Husky.barksAtIntruders();
			Husky.fetchesToys();
			
			System.out.println("The Husky breed has "+Husky.eyeColor+" eyes and is "+
			Husky.personality+".");
			System.out.println("-------------------------------------------------");
			
			Pup Bulldog = new Pup(); 
			Bulldog.fur = "Lilac";
			Bulldog.weightInLbs = 50;
			Bulldog.eyeColor = "brown";
			Bulldog.personality = "courageous";
			Bulldog.whinesForScraps();
			Bulldog.wagsTail();
			System.out.println("The Bulldog breed is "+Bulldog.personality+" and weighs around "+Bulldog.weightInLbs+" lbs.");
			System.out.println("---------------------------------------------------------");
			
			Pup Labrador = new Pup(); 
			Labrador.fur = "chocolate";
			Labrador.weightInLbs = 60;
			Labrador.eyeColor = "hazel";
			Labrador.personality = "loyal";
			Labrador.fetchesToys();
			Labrador.wagsTail();
			System.out.println("The Labrador breed has "+Labrador.eyeColor+" eyes and it's fur is a "+Labrador.fur+" color.");
		}
	}


