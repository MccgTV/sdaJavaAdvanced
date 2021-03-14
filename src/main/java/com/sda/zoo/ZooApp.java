package com.sda.zoo;

public class ZooApp {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly(120);

        Duck duck = new Duck();
        duck.fly(120);

        Air air = new Air();
        air.flyInAir(eagle);
        air.flyInAir(duck);

        Animal anotherDuck = new Duck();
        anotherDuck.eat("your dreams");

        Animal anotherEagle = new Eagle();
        anotherEagle.eat("your mother");

        FlyBehavior plain = new FlyBehavior() {
            @Override
            public void fly(double h) {
                if (h >= 3000) {
                    System.out.println("Latam wysoko :O");
                } else {
                    System.out.println("Latam na wysokości 3000");
                }
            }
        };
        plain.fly(4000);  //obiekt klasy anonimowej

    }
}
