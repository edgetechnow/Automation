package collectionFramework;

import java.util.ArrayList;

public class MyArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(); // create a new ArrayList
														// called fruits

		// add some fruits to the list
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");

		System.out.println(fruits); // print the entire list of fruits

		// get the fruit at index 1 (the second fruit)
		String secondFruit = fruits.get(1);
		System.out.println("The second fruit is: " + secondFruit);

		// remove the first fruit
		fruits.remove(0);

		// check if the list contains "banana"
		if (fruits.contains("banana")) {
			System.out.println("The list contains banana.");
		} else {
			System.out.println("The list does not contain banana.");
		}

		// get the size of the list
		int size = fruits.size();
		System.out.println("There are " + size + " fruits in the list.");

		// clear the list (remove all fruits)
		fruits.clear();
		System.out.println("The list is now empty.");
	}
}
