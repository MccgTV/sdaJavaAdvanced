package com.sda.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionApp {

    public static void main(String[] args) {

        // lista

        List<String> list = new ArrayList<>(); // Utworzenie listy
        list.add("Karol"); // Dodanie elementu do listy
        list.add("Wiktoria");
        list.add("Marek");

        for (String imie : list) { // Drukuj listę
            System.out.println(imie);
        }
        for (int i = 0; i <list.size(); ++i){ // Drukuj listę, drugi sposób
            System.out.println(list.get(i));
        }

        // set

        Set<String> set = new HashSet<>(); // Utworzenie seta
        set.add("Michał"); // Dodanie elementu seta
        set.add("Łucja");
        set.add("Patryk");

        for (String imie1 : set) { // Drukuj elementy seta
            System.out.println(imie1);
        }

        //Map
    }
}
