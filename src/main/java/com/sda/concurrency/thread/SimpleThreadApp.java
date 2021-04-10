package com.sda.concurrency.thread;

public class SimpleThreadApp {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new SleepingRunnable("1", 2));
        Thread thread2 = new Thread(new SleepingRunnable("2", 1));
        Thread thread3 = new Thread(new SleepingRunnable("3",4));
        Thread thread4 = new Thread(new SleepingRunnable("4",5));

        thread1.start(); // start 2 wątku
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
