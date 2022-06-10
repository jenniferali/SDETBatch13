package objects;

public class Phone {
	//Create a Class “Phone”. 
	//Create 3 Objects of it: iPhone, Pixel, Samsung 
	//with specific  attributes and behaviors.
	
	String shape;
	int storageGB;
	String color; 
	String cameraLens; 
	
	void shinesFlashlight() {
		System.out.println("The phone shines a flashlight.");
		
	}void ringsLoudly() {
		System.out.println("The phone rings loudly.");
		
	}void getsDropped() {
		System.out.println("The phone gets dropped.");
		
	}void takesPhotos() {
		System.out.println("The phone takes photos.");
	}
	public static void main(String[] args) {
		
		Phone iphone = new Phone(); 
		iphone.shape = "curved edges";
		iphone.storageGB = 256;
		iphone.color = "Gold";
		iphone.cameraLens = "12 MP wide-angle";
		iphone.shinesFlashlight();
		iphone.getsDropped();
		
		System.out.println("The iphone has "+iphone.shape+" and "+
				iphone.storageGB+" GB of storage.");
		System.out.println("--------------------------------------------------");
		
		Phone Pixel = new Phone(); 
		Pixel.shape = "slim";
		Pixel.storageGB = 15;
		Pixel.color = "Kinda Coral";
		Pixel.cameraLens = "12.2 MP Sony IMX363 sensor";
		Pixel.ringsLoudly();
		Pixel.takesPhotos();
		System.out.println("The Pixel is "+Pixel.shape+" and it's color is "+Pixel.color+".");
		System.out.println("------------------------------------------------");
		
		Phone Samsung = new Phone(); 
		Samsung.shape = "flat top";
		Samsung.storageGB = 128;
		Samsung.color = "Phantom Black";
		Samsung.cameraLens = "anti-reflective";
		Samsung.takesPhotos();
		Samsung.shinesFlashlight();
		System.out.println("The Samsung phone has a "+Samsung.shape+" and it's camera lens is "+Samsung.cameraLens+".");
	}
}
