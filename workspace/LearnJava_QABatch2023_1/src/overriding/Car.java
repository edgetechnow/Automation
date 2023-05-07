package overriding;
//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
public class Car extends Vehicle {

	/*
	 * we have a specific subclass of Vehicle called Car that inherits the
	 * drive() method, but we want to make it do something different. We can
	 * override the drive() method in the Car class with its own implementation:
	 */
	
	@Override
	public void drive() {
		
		System.out.println("This car is driving.");
	}
	
	

	/*
	 * the Car class overrides the drive() method of the Vehicle class with its
	 * own implementation that prints "This car is driving.
	 */

	public static void main(String[] args) {

		/*
		 * when we create a Vehicle object and call the drive() method on it, it
		 * will call the drive() method in the Vehicle class and print "This
		 * vehicle is driving.
		 * 
		 * 
		 */
		

		Vehicle vehicle = new Vehicle();
		vehicle.drive(); // Output: This vehicle is driving.

		/*
		 * when we create a Car object and call the drive() method on it, it
		 * will call the drive() method in the Car class and print
		 * "This car is driving."
		 */

		Car car = new Car();
		car.drive(); // Output: This car is driving.

		/*
		 * This shows how method overriding can be used in Java to redefine the
		 * behavior of a method in a subclass of a parent class
		 */

	}

}
