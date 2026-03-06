package com.dataingengjoer.monopoly.model.tiles;

import com.dataingengjoer.monopoly.model.Player;

public class TaxTile extends Tile {
    private int taxAmount;

    public TaxTile(String name, int taxAmount) {
        super(name);
        this.taxAmount = taxAmount;
    }

    @Override
    public void onLand(Player player) {
        player.pay(taxAmount);
    }
}
