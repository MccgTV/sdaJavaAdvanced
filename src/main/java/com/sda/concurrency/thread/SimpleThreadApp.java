package com.sda.concurrency.thread;

public class SimpleThreadApp {

    public static void main(String[] args) {

        SleepingRunnable sleepingRunnable = new SleepingRunnable("1");
        Thread thread = new Thread(new SleepingRunnable("2"));
        Thread thread2 = new Thread(new SleepingRunnable("3"));
        Thread thread3 = new Thread(new SleepingRunnable("4"));

        thread.start(); // start 2 wątku
        thread2.start();
        thread3.start();
    }
}
