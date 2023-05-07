package javaBasic;

public class MyClass {

	static int globalVar = 10; // global variable (class variable)
	int instanceVar = 20; // instance variable

	/*
	 * local variable -inside the method, global variable/class variable - inside
	 * the global scope inside the class but out side of method or constructor.
	 * Instance variable - instance variable that is unique to each instance of
	 * the class.
	 */

	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
//obj1 is reference or nickname of the class. using this you can get access to class object
		
		MyClass obj2 = new MyClass();

		// Access global variable using class name
		MyClass.globalVar = 15;
		System.out.println(MyClass.globalVar); // Output: 15
		System.out.println(obj1.globalVar); // Output: 15 (same as
											// MyClass.globalVar)
		System.out.println(obj2.globalVar); // Output: 15 (same as
											// MyClass.globalVar)

		// Access global variable using object instance
		obj1.globalVar = 25;
		System.out.println(MyClass.globalVar); // Output: 25 (changed by obj1)
		System.out.println(obj1.globalVar); // Output: 25
		System.out.println(obj2.globalVar); // Output: 25 (changed by obj1,
											// reflected in obj2)

		// Access instance variable using object instance
		obj1.instanceVar = 30;
		System.out.println(obj1.instanceVar); // Output: 30
		System.out.println(obj2.instanceVar); // Output: 20 (not affected by
												// obj1)
	}
}