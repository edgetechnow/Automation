package algorithm;

import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 1, 9}; // create an array of numbers

        System.out.println("Before sorting: " + Arrays.toString(numbers)); // print the array before sorting

        // use the built-in sorting algorithm to sort the array
        Arrays.sort(numbers);

        System.out.println("After sorting: " + Arrays.toString(numbers)); // print the array after sorting
    }
}

