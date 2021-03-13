package com.sda.vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        super(2);
        System.out.println("Tworzenie motocykla");
        System.out.println("Liczba kół " +getWheels());
    }

}
