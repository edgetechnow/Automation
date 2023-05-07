package inheritance;

//The SportsCar class, which inherits from Car
public class SportsCar  extends Car{
	boolean hasSpoiler;
	boolean hasRacingStripe;
	int horsepower;
	
	
	void drift() {
		// Code to make the sports car drift
	}

	void revEngine() {
		// Code to make the sports car rev its engine
	}
	
	SportsCar(){
		
		
		super();  //-- Car(){} is same since Car is superclass , we are calling the constructor of parent class
		
		super.brand = "Audi"; //coming from super class Class using super keyword 
		System.out.println(" My brand is "+ super.brand);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		SportsCar sCar = new SportsCar();
		
		sCar.brand = "BMW";
		sCar.color = "Yellow";
		sCar.doors = 2;
		sCar.model = "M5S";
		
		sCar.horsepower = 600;
		
		
		System.out.println("\nMy brand: " + sCar.brand  + " My color is : "+ sCar.color + 
				" I have door: "+sCar.doors + " My model is: "
			+	sCar.model + " my horsepower is : "+ sCar.horsepower );
		
	
		
		
		
		
	}
	
	
	
	
	
}
