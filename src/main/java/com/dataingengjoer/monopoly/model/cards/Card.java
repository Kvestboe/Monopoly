package com.dataingengjoer.monopoly.model.cards;

import com.dataingengjoer.monopoly.model.Player;

public abstract class Card {
    private String description;

    public Card(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute(Player player);
}
