package com.practice;


class MyThread extends Thread {
 private String threadName;

 public MyThread(String name) {
     this.threadName = name;
 }


 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(threadName + " - Count: " + i);
         try {
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             System.out.println(threadName + " interrupted.");
         }
     }
     System.out.println(threadName + " finished.");
 }
}

public class MultiThread {
	
	 public static void main(String[] args) {
	        
	        MyThread t1 = new MyThread("Thread 1");
	        MyThread t2 = new MyThread("Thread 2");
	        MyThread t3 = new MyThread("Thread 3");

	       
	        t1.start();
	        t2.start();
	        t3.start();
	    }

}
