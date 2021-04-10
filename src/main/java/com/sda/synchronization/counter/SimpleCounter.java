package com.sda.synchronization.counter;

public class SimpleCounter {

    private int value;

    synchronized void increment() {
        ++value;
    }

    synchronized void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "SimpleCounter{" +
                "value=" + value +
                '}';
    }
}
