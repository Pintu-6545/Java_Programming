package com.practice;

import java.util.Scanner;

public class Palindrome_String {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";  // to store reversed string

        // reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed string: " + rev);

        // check palindrome
        if (str.equals(rev)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
		
	}
}
