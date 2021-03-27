package com.sda.generic.box;

import com.sda.generic.box.Box;

import java.util.ArrayList;
import java.util.List;

public class BoxApp {

    public static void main(String[] args) {

        Box<Integer> boxLiczba = new Box<>();
        boxLiczba.setItem(23);

        Box<String> boxTekst = new Box<>();
        boxTekst.setItem("tekst");


        Box<Double> boxDouble = new Box<>();
        boxDouble.setItem(2.23);

        System.out.println(boxLiczba.getItem());
        System.out.println(boxTekst.getItem());
        System.out.println(boxDouble.getItem());

        List<String> texts = new ArrayList<>();
    }
}
