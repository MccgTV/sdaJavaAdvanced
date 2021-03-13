package com.sda.zoo;

public class Duck implements FlyBehavior {

    @Override
    public void fly(double height) {
        System.out.println("Duck flying at 100");

    }
}
