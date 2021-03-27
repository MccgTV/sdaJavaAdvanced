package com.sda.collections;

import com.sda.vehicle.Car;

import java.util.*;

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

        Map<String, String> people = new HashMap<>();
        people.put("Karol", "programista");
        people.put("Ola","socjolożka");

        //Iterowanie mapy po kluczach
        for (String name : people.keySet()) {
            System.out.println(name);
            System.out.println("Praca " +name+ " to jest " +people.get(name));
        }

        // Iterowanie po wartościach
        for (String job : people.values()) {
            System.out.println(job);
        }
        // Print w nawiasie klamrowym
        System.out.println(people);

        // Iterowanie po parach
        for (Map.Entry<String, String> pair : people.entrySet()) {
            System.out.println("Imię " + pair.getKey() + " zawód " + pair.getValue());
        }
    }
}
