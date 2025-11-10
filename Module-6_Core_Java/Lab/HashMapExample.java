package com.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs to the HashMap
        students.put(101, "John");
        students.put(102, "Alice");
        students.put(103, "Bob");
        students.put(104, "Emma");

        System.out.println("=== HashMap Elements ===");
        System.out.println(students);

        // Retrieve value using a key
        System.out.println("\nStudent with Roll No 102: " + students.get(102));

        // Remove an entry
        students.remove(103);
        System.out.println("After removing Roll No 103: " + students);

        // Iterate through HashMap using entrySet()
        System.out.println("\nIterating through HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " → Name: " + entry.getValue());
        }

        // Check if a key or value exists
        System.out.println("\nContains key 101? " + students.containsKey(101));
        System.out.println("Contains value 'Emma'? " + students.containsValue("Emma"));
    }	

}
