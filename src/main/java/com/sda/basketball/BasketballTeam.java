package com.sda.basketball;

import java.util.HashSet;
import java.util.Set;

public class BasketballTeam {

    Set<Player> team = new HashSet<>();

    void addPlayer(Player player) {
        team.add(player);
    }

    Set<Player> getPlayers() {
        return team;
    }
}
