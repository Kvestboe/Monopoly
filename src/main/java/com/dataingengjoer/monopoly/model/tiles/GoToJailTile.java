package com.dataingengjoer.monopoly.model.tiles;

import com.dataingengjoer.monopoly.model.Player;

public class GoToJailTile extends Tile {
    public GoToJailTile(String name) {
        super(name);
    }

    @Override
    public void onLand(Player player) {
        player.arrest();
    }
}
