package com.cybermonkey;

import java.util.Comparator;

public class PlayerNameComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
