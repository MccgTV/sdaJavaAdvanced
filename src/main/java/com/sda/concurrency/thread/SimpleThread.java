package com.sda.concurrency.thread;
import java.lang.Runnable;

public class SimpleThread implements Runnable {

    private String name;

    public SimpleThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Wątek " +name);

    }
}
