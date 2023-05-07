package algorithm;
//divide and conqure

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // base case: the element is not found
        }

        int mid = (low + high) / 2; // divide the array into two halves

        if (arr[mid] == target) {
            return mid; // base case: the element is found at the midpoint
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid-1); // recursive case: search the left half of the array
        } else {
            return binarySearch(arr, target, mid+1, high); // recursive case: search the right half of the array
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9}; // create a sorted array of numbers
        int target = 5; // the number we want to find

        int index = binarySearch(arr, target, 0, arr.length-1); // search for the number in the array

        if (index == -1) {
            System.out.println("The number " + target + " was not found in the array.");
        } else {
            System.out.println("The number " + target + " was found at index " + index + " in the array.");
        }
    }
}

