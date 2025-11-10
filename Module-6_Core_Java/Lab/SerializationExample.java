package com.practice;

import java.io.*;

//Step 1: Create a class that implements Serializable
class Students implements Serializable {
 private static final long serialVersionUID = 1L;  // Good practice for Serializable classes

 private int id;
 private String name;
 private int age;

 // Constructor
 public Students(int id, String name, int age) {
     this.id = id;
     this.name = name;
     this.age = age;
 }

 // Display method
 public void display() {
     System.out.println("Student ID: " + id);
     System.out.println("Student Name: " + name);
     System.out.println("Student Age: " + age);
 }
}

//Step 2: Main class to demonstrate serialization & deserialization

public class SerializationExample {

	 public static void main(String[] args) {
	        String filePath = "C:\\Users\\Pintu Ghanchi\\Desktop\\P1\\Practice_Data\\src\\demo1.txt";

	        // Create an object to serialize
	        Students s1 = new Students(101, "John Doe", 22);

	        // ---------------------------
	        // SERIALIZATION (Write object to file)
	        // ---------------------------
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
	            oos.writeObject(s1);
	            System.out.println("Object has been serialized successfully!");
	        } catch (IOException e) {
	            System.out.println("Error during serialization: " + e.getMessage());
	        }

	        // ---------------------------
	        // DESERIALIZATION (Read object from file)
	        // ---------------------------
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
	            Students s2 = (Students) ois.readObject();
	            System.out.println("\nObject has been deserialized successfully!");
	            s2.display();
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error during deserialization: " + e.getMessage());
	        }
	    }
}
