package com.sda.generic.road;

import com.sda.vehicle.Vehicle;

public class Road <T extends Vehicle> {

    private T item;

    public void runThisVehicle(double speed) {
        item.run(speed);
    }

    public Road(T item) {
        this.item = item;
    }

    public Road() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
