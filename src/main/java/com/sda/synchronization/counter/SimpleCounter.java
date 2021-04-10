package com.sda.synchronization.counter;

public class SimpleCounter {

    int value;

    public void increment() {
        ++value;
    }

    public void decrement() {
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
