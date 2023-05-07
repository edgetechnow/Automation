package collectionFramework;

import java.util.PriorityQueue;

public class MyPriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> tasks = new PriorityQueue<>(); // create a new PriorityQueue called tasks

        // add some tasks to the queue
        tasks.add("do homework");
        tasks.add("brush teeth");
        tasks.add("eat breakfast");

        System.out.println(tasks); // print the entire queue of tasks

        // get the next task (the one with the highest priority)
        String nextTask = tasks.peek();
        System.out.println("The next task is: " + nextTask);

        // remove the next task from the queue
        tasks.poll();

        // check if the queue is empty
        if (tasks.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }

        // get the size of the queue
        int size = tasks.size();
        System.out.println("There are " + size + " tasks in the queue.");
    }
}

