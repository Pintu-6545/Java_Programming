package com.practice;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int no1 = sc.nextInt();
        System.out.println("Enter Number 2:");
        int no2 = sc.nextInt();

        while (true) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition: " + (no1 + no2));
                    break;
                case 2:
                    System.out.println("Subtraction: " + (no1 - no2));
                    break;
                case 3:
                    System.out.println("Multiplication: " + (no1 * no2));
                    break;
                case 4:
                        System.out.println("Division: " + (no1 / no2));
                    
                    break;
                case 5:
                    System.out.println("Thank you for visiting!");
                    return  ;
                    
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }
        }
    }
}
