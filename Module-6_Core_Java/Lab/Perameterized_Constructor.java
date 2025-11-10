package com.practice;

class Student2 {
    String name;
    int age;

    Student2(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Perameterized_Constructor {
    public static void main(String[] args)
    {
        Student2 s1 = new Student2("Karan", 25);

        s1.display();
    }
}
