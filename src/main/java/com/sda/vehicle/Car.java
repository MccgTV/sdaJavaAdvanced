package com.sda.vehicle;
import java.util.List;

public class Car extends Vehicle {

    private int passengers;

    public Car() {
        System.out.println("Tworzenie car");
    }

    @Override
    public void run(double velocity) {
        System.out.println("Pasażerowie jadą z prędkością " + velocity);
    }

    public void addPassengers() {
        passengers += 1;
        if (passengers == 1) {
        System.out.println("Aktualnie jest " + passengers + " pasażer"); }
        else {
        System.out.println("Aktualnie jest " + passengers + " pasażerów"); }
    }

    public void removePassangers() {
        passengers -= 1;
        if (passengers == 1) {
            System.out.println("Aktualnie jest " + passengers + " pasażer"); }
        else {
            System.out.println("Aktualnie jest " + passengers + " pasażerów"); }
    }


}
