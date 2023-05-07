package collectionFramework;

import java.util.HashMap;

public class MyHashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>(); // create a new HashMap called ages

        // add some people's ages to the map
        ages.put("Alice", 7);
        ages.put("Bob", 5);
        ages.put("Charlie", 10);

        // get Alice's age
        int aliceAge = ages.get("Alice");
        System.out.println("Alice is " + aliceAge + " years old.");

        // check if the map contains "Charlie"
        if (ages.containsKey("Charlie")) {
            System.out.println("The map contains Charlie.");
        } else {
            System.out.println("The map does not contain Charlie.");
        }

        // remove Bob's age from the map
        ages.remove("Bob");

        // get the size of the map
        int size = ages.size();
        System.out.println("There are " + size + " people in the map.");

        // clear the map (remove all people)
        ages.clear();
        System.out.println("The map is now empty.");
    }
}
