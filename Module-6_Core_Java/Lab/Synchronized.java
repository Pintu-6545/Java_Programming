package com.practice;

class Table {
    
   
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500); // pause to simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    void printSquare(int n) {
        synchronized (this) {  
            for (int i = 1; i <= 3; i++) {
                System.out.println("Square of " + i + " = " + (i * i));
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printSquare(3);
    }
}

public class Synchronized {
	
	public static void main(String[] args) {
        Table obj = new Table(); 

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }

}
