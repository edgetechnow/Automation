package collectionFramework;
/*
List Interface

ArrayList: List<String> list = new ArrayList<>();
LinkedList: List<String> list = new LinkedList<>();
Vector: List<String> list = new Vector<>();
Stack: Stack<String> stack = new Stack<>();
Set Interface

HashSet: Set<String> set = new HashSet<>();
LinkedHashSet: Set<String> set = new LinkedHashSet<>();
TreeSet: Set<String> set = new TreeSet<>();
Queue Interface

PriorityQueue: Queue<String> queue = new PriorityQueue<>();
ArrayDeque: Deque<String> deque = new ArrayDeque<>();
Map Interface

HashMap: Map<String, Integer> map = new HashMap<>();
LinkedHashMap: Map<String, Integer> map = new LinkedHashMap<>();
TreeMap: Map<String, Integer> map = new TreeMap<>();
Hashtable: Map<String, Integer> map = new Hashtable<>();*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Collection {
	
	// ArrayList example
	List<String> list = new ArrayList<>(); // Create a new ArrayList
	
	
	
	list.add("apple"); // Add "apple" to the list
	list.add("banana"); // Add "banana" to the list
	list.add("cherry"); // Add "cherry" to the list
	System.out.println(list); // Print the list to the console

	// HashSet example
	Set<Integer> set = new HashSet<>(); // Create a new HashSet
	set.add(1); // Add 1 to the set
	set.add(2); // Add 2 to the set
	set.add(3); // Add 3 to the set
	System.out.println(set); // Print the set to the console

	// PriorityQueue example
	Queue<Integer> queue = new PriorityQueue<>(); // Create a new PriorityQueue
	queue.add(3); // Add 3 to the queue
	queue.add(1); // Add 1 to the queue
	queue.add(2); // Add 2 to the queue
	System.out.println(queue); // Print the queue to the console

	// HashMap example
	Map<String, Integer> map = new HashMap<>(); // Create a new HashMap
	map.put("apple", 1); // Add "apple" with value 1 to the map
	map.put("banana", 2); // Add "banana" with value 2 to the map
	map.put("cherry", 3); // Add "cherry" with value 3 to the map
	System.out.println(map); // Print the map to the console



}
