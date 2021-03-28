package com.sda.basketball;

import java.util.*;

public class BasketballApp {

    public static void main(String[] args) {

        BasketballTeam chicagoBulls = new BasketballTeam();
        Player jordan = new Player("Michael", "Jordan", 198);
        Player jordan1 = new Player("Michael", "Jordan",198);
        Player lebron = new Player("James", "LeBron",213);
        Player lebron2 = new Player("James", "LeBron2",160);

        jordan.hashCode();
        System.out.println("Tacy sami: " +jordan.equals(jordan1));

        chicagoBulls.addPlayer(jordan);
        chicagoBulls.addPlayer(jordan1);
        chicagoBulls.addPlayer(lebron);
        chicagoBulls.addPlayer(lebron2);

        System.out.println(chicagoBulls.getTeam());

        System.out.println(jordan.compareTo(jordan1));


      //  System.out.println(chicagoBulls.getHigherThan200());

        List<Player> players = new ArrayList<>();
        players.add(jordan);

        players.add(lebron);
        Player gortat = new Player("Marcin", "Gortat",211);
        players.add(gortat);
        Player malysz = new Player("Adam", "Małysz",170);
        players.add(malysz);

        // naturalny porządek
        players.sort(null);
        System.out.println(players);

        // naturalny porządek z Collections
        Collections.sort(players);
        System.out.println(players);

        // odwrocona lista
        players.sort(Comparator.reverseOrder());
        System.out.println(players);

        // odwrocona lista z Collections
        Collections.sort(players, Collections.reverseOrder());
        System.out.println(players);

        System.out.println(chicagoBulls.higherThan180());

    }


}
