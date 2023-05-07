package algorithm;
//Recursion
public class FactorialExample {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case: the factorial of 0 or 1 is 1
        }

        return n * factorial(n-1); // recursive case: the factorial of n is n times the factorial of n-1
    }

    public static void main(String[] args) {
        int n = 5; // the number we want to calculate the factorial of

        System.out.println("The factorial of " + n + " is " + factorial(n));
    }
}

