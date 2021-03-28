package com.sda.basketball;

import java.util.function.Predicate;

public class HigherThan180 implements Predicate<Player> {
    @Override
    public boolean test(Player player) {
        if(player.getHeight() > 180) {
            return true;
        } else {
            return false;
        }
    }
}
