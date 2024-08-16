package com.neml.java.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class InterCommunicationExample {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        AtomicInteger count = new AtomicInteger(0);
        PrintHello hello = new PrintHello(lock, count);
        PrintWorld printWorld = new PrintWorld(lock, count);
        hello.start();
        printWorld.start();
    }
}

class PrintHello extends Thread {

    private Object lock;
    private AtomicInteger count;

    PrintHello(Object lock, AtomicInteger count) {
        this.lock = lock;
        this.count = count;
    }

    public void run() {
        try {
            while (count.get() <= 5) {
                synchronized (lock) {
                    while (count.get() % 2 != 0) {
                        lock.wait();
                    }
                    System.out.println("Hello");
                    count.incrementAndGet();
                    lock.notify();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class PrintWorld extends Thread {

    private Object lock;
    private AtomicInteger count;

    PrintWorld(Object lock, AtomicInteger count) {
        this.lock = lock;
        this.count = count;
    }

    public void run() {
        try {
            while (count.get() <= 5) {
                synchronized (lock) {
                    while (count.get() % 2 == 0) {
                        lock.wait();
                    }
                    System.out.println("World");
                    count.incrementAndGet();
                    lock.notify();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}