package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {


	    public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<String> fruits = new ArrayList<>();

	        // Add elements
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        System.out.println("Initial List: " + fruits);

	        // Access elements
	        System.out.println("First Element: " + fruits.get(0));

	        // Update an element
	        fruits.set(1, "Mango");
	        System.out.println("Updated List: " + fruits);

	        // Remove an element
	        fruits.remove("Cherry");
	        System.out.println("After Removal: " + fruits);

	        // Sort elements
	        Collections.sort(fruits);
	        System.out.println("Sorted List: " + fruits);

	        // Check if the list contains an element
	        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));

	        // Iterate through the list
	        System.out.println("List Elements:");
	        fruits.forEach(System.out::println);

	        // Clear the list
	        fruits.clear();
	        System.out.println("Cleared List: " + fruits);
	    }
	}



