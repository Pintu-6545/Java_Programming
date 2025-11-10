package com.practice;

import java.util.Scanner;

public class StringComparission {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Input two strings from user
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Using equals() method
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal using equals().");
        } else {
            System.out.println("Strings are not equal using equals().");
        }

        // Using compareTo() method
        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("Both strings are equal using compareTo().");
        } else if (result > 0) {
            System.out.println("First string is greater than second string using compareTo().");
        } else {
            System.out.println("First string is smaller than second string using compareTo().");
        }

       
	}
}
