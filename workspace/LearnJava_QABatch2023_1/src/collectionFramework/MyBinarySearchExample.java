package collectionFramework;

import java.util.Arrays;

public class MyBinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9}; // create a new array of numbers

        // search for the number 5 in the array using binary search
        int index = Arrays.binarySearch(numbers, 5);

        if (index >= 0) {
            System.out.println("The number 5 is at index " + index + " in the array.");
        } else {
            System.out.println("The number 5 is not in the array.");
        }
    }
}
