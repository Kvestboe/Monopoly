package com.dataingengjoer.monopoly.model.cards;

import com.dataingengjoer.monopoly.model.Player;

public class JailCard extends Card {
    public JailCard(String description) {
        super(description);
    }

    @Override
    public void execute(Player player) {
        player.arrest();
    }
}
