package overloading;
/*
 * Imagine that you have a toy box with different types of toys, like cars,
 * dolls, and blocks. Sometimes you want to play with just one specific type
 * of toy, and sometimes you want to play with a group of toys together.
 * 
 * In the same way, in Java, you can have a class with different methods
 * that have the same name but different parameters. This is called method
 * overloading.
 */

public class ToyBox {

	// If a class has multiple methods having same name but different in
	// parameters, it is known as Method Overloading.

	public void play() {
		// Code to play with all the toys in the toy box
		System.out.println("Playing with everything");
	}

	public void play(String toyType) {

		// Code to play with just the specified type of toy

		/*
		 * here the ToyBox class overloads the play() method with a new version
		 * of the method that takes a toyType parameter.
		 */

		System.out.println(" I am playing with : " + toyType);

	}
	
	

	public void play(String toyType, int toyNumber) {

		System.out.println(" I play with : " + toyType + " I have " + toyNumber);

	}

	public static void main(String[] args) {

		/*
		 * Now, when we call the play() method on a ToyBox object, it will call
		 * the original play() method that plays with all the toys in the toy
		 * box:
		 */

		ToyBox toyBox = new ToyBox();
		toyBox.play(); // Plays with all the toys in the toy box

		toyBox.play("car"); // Plays with just the cars in the toy box

		toyBox.play("doll"); // Plays with just the doll in the toy box
		
		toyBox.play("Airplane", 4);

	}
}
