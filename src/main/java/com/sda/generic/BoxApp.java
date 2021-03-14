package com.sda.generic;

import java.util.ArrayList;
import java.util.List;

public class BoxApp {

    public static void main(String[] args) {

        Box<Integer> boxLiczba = new Box<Integer>();
        boxLiczba.setItem(23);

        Box<String> boxTekst = new Box<String>();
        boxTekst.setItem("tekst");

        Box<Double> boxDouble = new Box<Double>();
        boxDouble.setItem(2.23);

        System.out.println(boxLiczba.getItem());
        System.out.println(boxTekst.getItem());
        System.out.println(boxDouble.getItem());

        List<String> texts = new ArrayList<>();
    }
}
