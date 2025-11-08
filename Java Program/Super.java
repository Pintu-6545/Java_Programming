package core.java;

import java.util.Scanner;

class Student {

	    int rno;

    Student() {
        int age = 12;
        System.out.println("Age:" + age);
    }

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll");
        rno = sc.nextInt();
    }

    void putData() {
        System.out.println("Roll:" + rno);
        //	System.out.println("Name:" name;)
    }
}

class Teacher extends Student {

    String name;

    Teacher() {
        super();
        String name1 = "Rupali Sharma";
        System.out.println("Teacher" + name1);
    }

    void getData() {
        super.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Name:");
        name = sc.nextLine();
    }

    void putData() {
        super.putData();
        System.out.println("Student Name:" + name);
    }
}

public class Super {

    public static void main(String[] args) {

        //Student s1 =new Student();
        Teacher t1 = new Teacher();
        t1.getData();
        t1.putData();

    }
}
