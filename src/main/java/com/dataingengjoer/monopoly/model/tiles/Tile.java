package com.dataingengjoer.monopoly.model.spaces;

import com.dataingengjoer.monopoly.model.Player;

public abstract class Space {
    private String name;

    public Space(String name) {
        this.name = name;
    }

    public abstract void onLand(Player player);
}
