package algorithm;
import java.util.*;

public class GraphTraversalExample {
    private Map<Integer, List<Integer>> adjList = new HashMap<>(); // create an adjacency list to represent the graph

    public void addEdge(int u, int v) {
        List<Integer> neighbors = adjList.getOrDefault(u, new ArrayList<>()); // get the list of neighbors for u (or create a new list if it doesn't exist)
        neighbors.add(v); // add v to the list of neighbors for u
        adjList.put(u, neighbors); // update the adjacency list with the new list of neighbors for u
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>(); // create a set to keep track of visited nodes
        Stack<Integer> stack = new Stack<>(); // create a stack to keep track of nodes to visit

        stack.push(start); // add the start node to the stack

        while (!stack.isEmpty()) {
            int current = stack.pop(); // remove the top node from the stack

            if (!visited.contains(current)) { // if the node hasn't been visited yet
                visited.add(current); // mark it as visited
                System.out.print(current + " "); // print it out

                List<Integer> neighbors = adjList.getOrDefault(current, new ArrayList<>()); // get the list of neighbors for the current node

                for (int neighbor : neighbors) { // add all unvisited neighbors to the stack
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphTraversalExample g = new GraphTraversalExample(); // create a new graph

        // add edges to the graph
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 6);

        System.out.print("Depth-first traversal starting from node 1: ");
        g.dfs(1); // traverse the graph using depth-first search starting from node 1
    }
}
