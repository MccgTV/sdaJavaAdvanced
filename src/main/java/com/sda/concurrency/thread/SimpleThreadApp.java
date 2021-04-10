package com.sda.concurrency.thread;

public class SimpleThreadApp {

    public static void main(String[] args) {

        SimpleThread simpleThread = new SimpleThread("1");
        Thread thread = new Thread(simpleThread);

        thread.start();
    }
}
