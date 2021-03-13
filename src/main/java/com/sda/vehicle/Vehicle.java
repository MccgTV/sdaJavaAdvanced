package com.sda.vehicle;

public class Vehicle {

    int wheels;
    String name;

    public Vehicle() {
        wheels = 4;
        System.out.println("Tworzenie vehicle z " + wheels + " kołami");
    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
        System.out.println("Tworzenie vehicle z " + wheels + " kołami");
    }

    public void run(double velocity) {
        System.out.println("Vehicle running at speed " + velocity);
    }

    public Vehicle(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
        System.out.println("Tworzenie vehicle z " + name + " z " + wheels + " kołami");
    }

    public int getWheels() {
        return wheels;
    }

}
