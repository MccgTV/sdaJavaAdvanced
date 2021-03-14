package com.sda.exceptions;

import javax.naming.InvalidNameException;

public class MyExceptionApp {

    public static void main(String[] args)  {
    try {
        MyExceptionApp.greet("");
    } catch (MyException invalidNameException) {
        System.out.println("Błąd programu" + invalidNameException.getMessage());
    }
    }
    static void greet(String name) throws MyException {
        if (name == null || name.isEmpty()) {
            throw new MyException("Imię jest puste");
        }
        if (name.length() == 1) {
            throw new MyException("Błąd, imię jest za krótkie");
        }
        System.out.println("Hello " + name);
    }
}
