package com.sda.vehicle;

public class VehicleApp {

    public static void main(String[] args) {

//        Car car = new Car();
//        car.run(120);
//        car.addPassengers();
//        car.addPassengers();
//
//        ConvertibleCar convertibleCar = new ConvertibleCar();
//        convertibleCar.openRoof();
//        convertibleCar.closeRoof();

//        Motorcycle motorcycle = new Motorcycle();
//        System.out.println("Dostep z zewntarz " + motorcycle.getWheels());

        Vehicle vehicle = new Vehicle(4);
        runThisVehicle(vehicle);

        Car car = new Car();
        runThisVehicle(car);

        Motorcycle motorcycle = new Motorcycle();
        runThisVehicle(motorcycle);
        }

        private static void runThisVehicle(Vehicle vehicle) {
        vehicle.run(100);
        }


    }

