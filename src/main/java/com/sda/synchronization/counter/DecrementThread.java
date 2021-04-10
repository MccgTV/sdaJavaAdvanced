package com.sda.synchronization.counter;

public class DecrementThread extends Thread {

    private SimpleCounter counter;

    public DecrementThread(SimpleCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i<10000; ++i){
            counter.increment();
        }


    }
}
