package com.dataingengjoer.monopoly.model.spaces;

import com.dataingengjoer.monopoly.model.Player;

public class TaxSpace extends Space {
    private int taxAmount;

    public TaxSpace(String name, int taxAmount) {
        super(name);
        this.taxAmount = taxAmount;
    }

    @Override
    public void onLand(Player player) {
        player.pay(taxAmount);
    }
}
