package com.sda.concurrency.thread;
import java.lang.Runnable;

public class SleepingRunnable implements Runnable {

    private String name;
    private int seconds;

    public SleepingRunnable(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(1000*seconds);
                System.out.println("Wątek " + name);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
