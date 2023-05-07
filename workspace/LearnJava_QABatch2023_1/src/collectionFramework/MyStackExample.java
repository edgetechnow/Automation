package collectionFramework;

import java.util.Stack;

public class MyStackExample {
    public static void main(String[] args) {
        Stack<String> colors = new Stack<>(); // create a new Stack called colors

        // add some colors to the stack
        colors.push("red");
        colors.push("green");
        colors.push("blue");

        System.out.println(colors); // print the entire stack of colors

        // get the top color (the one that was added last)
        String topColor = colors.peek();
        System.out.println("The top color is: " + topColor);

        // remove the top color from the stack
        String removedColor = colors.pop();
        System.out.println("Removed color: " + removedColor);

        // check if the stack is empty
        if (colors.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        // get the size of the stack
        int size = colors.size();
        System.out.println("There are " + size + " colors in the stack.");
    }
}

