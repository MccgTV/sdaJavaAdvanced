package com.sda.vehicle;

public class ConvertibleCar extends Car {

    boolean roofStatus = true;

    public void openRoof() {
        if (roofStatus == true)
            System.out.println("Roof is open");
    }

    public void closeRoof() {
        if (roofStatus == false) {
            System.out.println("Roof is closed");
        }
    }
}



