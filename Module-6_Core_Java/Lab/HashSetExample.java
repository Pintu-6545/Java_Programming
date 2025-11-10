package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	
	 public static void main(String[] args) {
	        // Create a list with duplicate elements
	        List<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Apple");
	        fruits.add("Mango");
	        fruits.add("Banana");

	        System.out.println("Original List: " + fruits);

	        // Use HashSet to remove duplicates
	        Set<String> uniqueFruits = new HashSet<>(fruits);

	        // Convert back to list (if needed)
	        List<String> uniqueList = new ArrayList<>(uniqueFruits);

	        System.out.println("List after removing duplicates: " + uniqueList);
	    }

}
