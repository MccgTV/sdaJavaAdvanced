package com.sda.examples;

public class Greeter {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Michał");
        greeter.greet("Cześć","Michał");


    }

        void greet() {
            System.out.println("Hello");
        }

        void greet(String name){
            System.out.println("Hello " + name);
        }

        void greet(String greeting, String name){
            System.out.println(greeting +" "+ name);
        }

    }


