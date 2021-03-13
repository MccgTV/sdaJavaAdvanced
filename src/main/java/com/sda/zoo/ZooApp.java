package com.sda.zoo;

public class ZooApp {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly(120);


        int height = 0;
        Duck duck = new Duck();
        duck.fly(120);
        if (height >= 100) {
            height = 100;
        }
    }
}
