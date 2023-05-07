package algorithm;

import java.util.Arrays;

public class SearchingExample {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9}; // create an array of numbers

        int target = 5; // the number we want to find

        System.out.println("Array: " + Arrays.toString(numbers)); // print the array

        // use binary search to find the target number in the array
        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println(target + " was found at index " + index + ".");
        } else {
            System.out.println(target + " was not found in the array.");
        }
    }
}
