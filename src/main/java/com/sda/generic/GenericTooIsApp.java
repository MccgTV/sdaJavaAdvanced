package com.sda.generic;

import com.sda.vehicle.Car;

public class GenericTooIsApp {

//    public static void main(String[] args) {
//        print("String");
//        print(123);
//
//    }
//
//    //publ. stat. gen. zwr. void metoda o nazwie print przyjmujaca arg. item
//    public static <T> void print(T item) {
//        System.out.println(item.toString());
//        System.out.println(item.getClass());
//    }

    public static <T> void hasDuplicate (T[] arrayT) {
        for (int i = 0; i < arrayT.length; i++) {
            for (int j = i+1; j< arrayT.length; j++) {
                if(arrayT[i].equals(arrayT[j])) {
                    System.out.println("This method has duplicates " + arrayT[i] +" "+ arrayT[j]);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[] {1,2,3,4,5,2};
        String[] strings = new String[] {"Michał", "Ola", "Kasia", "Tomek", "Ola"};
        hasDuplicate(integers);
        hasDuplicate(strings);
    }
}
