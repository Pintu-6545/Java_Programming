package com.practice;

class SharedResource {
    private boolean available = false;

   
    synchronized void produce() {
        if (available) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Producer produced an item");
        available = true;
        notify(); 
        }

    // Method for Consumer (uses data)
    synchronized void consume() {
        if (!available) {
            try {
                wait(); // wait until the producer produces
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumer consumed an item");
        available = false;
        notify(); // notify producer that space is available
    }
}

// Producer Thread
class Producer extends Thread {
    SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class InterThread {
	
	public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.start();
        c.start();
    }

}
