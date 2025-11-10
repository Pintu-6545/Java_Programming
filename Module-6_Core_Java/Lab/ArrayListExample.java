package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	
    public static void main(String[] args) {
        // -----------------------------
        //  Using ArrayList
        // -----------------------------
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Mango");

        System.out.println("=== ArrayList Example ===");
        System.out.println("Elements: " + arrayList);

        arrayList.add(2, "Orange"); // Insert at index
        System.out.println("After inserting 'Orange' at index 2: " + arrayList);

        arrayList.remove("Banana"); // Remove element
        System.out.println("After removing 'Banana': " + arrayList);

        System.out.println("Access element at index 1: " + arrayList.get(1));

        // -----------------------------
        //  Using LinkedList
        // -----------------------------
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Elephant");
        linkedList.add("Tiger");

        System.out.println("\n=== LinkedList Example ===");
        System.out.println("Elements: " + linkedList);

        linkedList.addFirst("Lion"); // Add at beginning
        linkedList.addLast("Zebra"); // Add at end
        System.out.println("After adding 'Lion' and 'Zebra': " + linkedList);

        linkedList.removeFirst(); // Remove first element
        linkedList.removeLast();  // Remove last element
        System.out.println("After removing first and last elements: " + linkedList);

        System.out.println("Access element at index 2: " + linkedList.get(2));
    }


}
