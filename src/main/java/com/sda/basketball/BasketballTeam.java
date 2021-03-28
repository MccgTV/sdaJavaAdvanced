package com.sda.basketball;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasketballTeam {

    Set<Player> team = new HashSet<>();

    void addPlayer(Player player) {
        team.add(player);
    }

    Set<Player> getTeam() {
        return team;
    }

//    public Optional<Player> getHigherThan200() {
//        for(Player player : team) {
//            if (player.getHeight() > 200) {
//                return Optional.of(player);
//            }
//        }
//        return Optional.empty();
//    }

    // metoda Predicate
//    public Set<Player> higherThan180forLoop() {
//        Predicate<Player> predicate = new HigherThan180();
//        Set<Player> passed = new HashSet<>();
//        for (Player player:team) {
//            if(predicate.test(player)) {
//            passed.add(player);
//        }
//    } return passed;

    public Set<Player> getHigherThan180() {
        Predicate<Player> higherThan180 = new HigherThan180();
        Set<Player> passed = new HashSet<>();

        passed = team.stream()
                .filter(higherThan180)
                .collect(Collectors.toSet());
        return passed;
    }

}
