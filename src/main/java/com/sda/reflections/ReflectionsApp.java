package com.sda.reflections;

import  com.sda.vehicle.Car;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionsApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<Car> klasaCar = Car.class;
        Method[] methods = klasaCar.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Car car = new Car();
        Method metodaRun = klasaCar.getDeclaredMethod("run", Double.class);
        metodaRun.invoke(car, 100d);
    }
}
