package com.sda.concurrency.thread;
import java.lang.Runnable;

public class SleepingRunnable implements Runnable {

    private String name;

    public SleepingRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(5000);
                System.out.println("Wątek " + name);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
