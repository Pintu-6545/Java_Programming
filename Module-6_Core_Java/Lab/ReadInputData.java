package com.practice;

import java.util.Scanner;

public class ReadInputData {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();  

        // Displaying the entered data
        System.out.println("\n--- Student Details ---");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);

    }

}
