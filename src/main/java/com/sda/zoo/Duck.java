package com.sda.zoo;

public class Duck implements FlyBehavior {

    @Override
    public void fly(double height) {

        double actualHeight = Math.min(height, 100);
        System.out.println("Duck flying at 100");
        }


    }
