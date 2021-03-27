package com.sda.basketball;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class BasketballTeam {

    Set<Player> team = new HashSet<>();

    void addPlayer(Player player) {
        team.add(player);
    }

    Set<Player> getTeam() {
        return team;
    }

    public Optional<Player> getHigherThan200() {
        for(Player player : team) {
            if (player.getHeight() > 200) {
                return Optional.of(player);
            }
        }
        return Optional.empty();
    }
}
