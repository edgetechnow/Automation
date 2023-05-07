package algorithm;
//dynamic programming

public class FibonacciExample {
    private static int[] memo = new int[100]; // create a memo table to store previously calculated values

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // base case
        }

        if (memo[n] != 0) {
            return memo[n]; // if the value has already been calculated, return it from the memo table
        }

        int result = fibonacci(n-1) + fibonacci(n-2); // recursive case
        memo[n] = result; // store the result in the memo table
        return result;
    }

    public static void main(String[] args) {
        int n = 10; // the Fibonacci number we want to calculate

        System.out.println("The " + n + "th Fibonacci number is " + fibonacci(n));
    }
}
