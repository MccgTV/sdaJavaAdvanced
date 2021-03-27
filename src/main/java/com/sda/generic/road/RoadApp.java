package com.sda.generic.road;

import com.sda.vehicle.Car;
import com.sda.vehicle.ConvertibleCar;
import com.sda.vehicle.Motorcycle;
import com.sda.vehicle.Vehicle;

public class RoadApp {
    public static void main(String[] args) {

        Road<Car> carRoad = new Road<>(new Car());
        carRoad.getItem();
        carRoad.runThisVehicle(120);

        Road<Motorcycle> motorRoad = new Road<>(new Motorcycle());
        motorRoad.getItem();
        motorRoad.runThisVehicle(200);

        Car car = carRoad.getItem();
        car.addPassengers();






//        Road<String> stringRoad = new Road<>();
//        stringRoad.setItem("Marszałkowska");
//        String streetName = stringRoad.getItem();
//
//        Road<Integer> integerRoad = new Road<>();
//        integerRoad.setItem(1234);
//        int number = integerRoad.getItem();


        //ZLE, uzycie surowego typu, rzutowanie
//        Road rawRoad = new Road();
//        rawRoad.setItem(1234);

        //Object rawRoadItem = rawRoad.getItem();
        //WYWALI SIE W RUNTIME, NIE JEST SPRAWDZANE PRZY KOMPILACJI
        //Car car = (Car) rawRoad.getItem();
    }
   }
