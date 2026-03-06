package com.dataingengjoer.monopoly.model.tiles;

import com.dataingengjoer.monopoly.model.Player;

public abstract class Tile {
    private String name;

    public Tile(String name) {
        this.name = name;
    }

    public void onLand(Player player) {}
}
