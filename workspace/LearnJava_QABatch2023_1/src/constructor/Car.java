package constructor;

public class Car {
    private String color; //by default null 
    private int numWheels; //by default 0
    //by default -- Car(){} which is invisible unless we call it 
    
   // Access Modifier - default, public, protected, private
    
     static void myMethod(){//method  has return type 
    	 
    	 
    	 System.out.println("Hi I am a Method");
    	
    }
     
     public static void main(String[] args){
    	 
    	 
    	 Car mycar = new Car();//Object creation of the class 
    	 
    	 Car myNewCar = new Car("White");// we can change the value from here if constucture didnt delcare any value
    	 
    	 
    
    	 
     }
    
 
    
    
	public Car() { // constructor doesn't have return type and use same name as Class
		this.color = "red";
		this.numWheels = 4;
	System.out.println("A new car has been created with color " + 
		this.color + " and " + this.numWheels + " wheels.");
	}
	
	
	
	public Car(String color){
		this.color = color;
		this.numWheels = 8;
		
		System.out.println("A new car has been created with color " + 
				this.color + " and " + this.numWheels + " wheels.");
	}
	
	
	
	
}
/*In this example, we have a class called Car with two instance variables, 
color and numWheels. We also have a constructor for the Car class that takes 
no parameters (i.e., it is a default constructor).

In the constructor, we set the color variable to "red" and the numWheels variable to 4. 

This means that every time a new Car object is created using this constructor, it will 
automatically have a color of "red" and numWheels of 4.
"A constructor is like a magic spell that makes a new object. 
In our example, the object is a car. When we say 'new Car()', 
the magic spell creates a car with a red color and four wheels.
 We don't need to say what color or how many wheels we want, 
 because the magic spell already knows."*/