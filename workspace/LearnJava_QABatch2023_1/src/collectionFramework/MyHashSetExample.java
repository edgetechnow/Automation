package collectionFramework;

import java.util.HashSet;

public class MyHashSetExample {
    public static void main(String[] args) {
        HashSet<String> animals = new HashSet<>(); // create a new HashSet called animals

        // add some animals to the set
        animals.add("dog");
        animals.add("cat");
        animals.add("bird");

        System.out.println(animals); // print the entire set of animals

        // check if the set contains "cat"
        if (animals.contains("cat")) {
            System.out.println("The set contains a cat.");
        } else {
            System.out.println("The set does not contain a cat.");
        }

        // remove the bird from the set
        animals.remove("bird");

        // get the size of the set
        int size = animals.size();
        System.out.println("There are " + size + " animals in the set.");

        // clear the set (remove all animals)
        animals.clear();
        System.out.println("The set is now empty.");
    }
}

