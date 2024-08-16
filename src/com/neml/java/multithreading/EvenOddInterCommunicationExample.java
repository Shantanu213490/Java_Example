package com.neml.java.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class EvenOddInterCommunicationExample {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        AtomicBoolean isEven = new AtomicBoolean(true);
        ListOfEvenNumbers evenNumbers = new ListOfEvenNumbers(lock, isEven);
        ListOfOddNumbers listOfOddNumbers = new ListOfOddNumbers(lock, isEven);
        evenNumbers.start();
        evenNumbers.sleep(1000);
        listOfOddNumbers.start();
        listOfOddNumbers.sleep(1000);

    }

}

class ListOfEvenNumbers extends Thread {

    private Object lock;
    private AtomicBoolean isEven;
    List<Integer> nums = Arrays.asList(2, 5, 1, 6, 3, 8);
    List<Integer> evenNumbers = nums.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

    public ListOfEvenNumbers(Object lock, AtomicBoolean isEven) {
        this.lock = lock;
        this.isEven = isEven;
    }

    public void run() {

        try {
            synchronized (lock) {
            	 for (int i : evenNumbers) {
                     while (!isEven.get()) {
                         lock.wait();
                     }
                     System.out.println("Even Number : " + i);
                     isEven.set(false);
                     lock.notifyAll();
                 }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class ListOfOddNumbers extends Thread {

    private Object lock;
    private AtomicBoolean isEven;
    List<Integer> nums = Arrays.asList(2, 5, 1, 6, 3, 8);
    List<Integer> oddNumbers = nums.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

    public ListOfOddNumbers(Object lock, AtomicBoolean isEven) {
        this.lock = lock;
        this.isEven = isEven;
    }

    public void run() {

        try {
            synchronized (lock) {
            	for (int i : oddNumbers) {
                    while (isEven.get()) {
                        lock.wait();
                    }
                    System.out.println("Odd Number : " + i);
                    isEven.set(true);
                    lock.notifyAll();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}