package com.dataingengjoer.monopoly.model.cards;

import com.dataingengjoer.monopoly.model.Player;

public class MoveCard extends Card {
    private int steps;

    public MoveCard(String description, int steps) {
        super(description);
        this.steps = steps;
    }

    @Override
    public void execute(Player player) {
        player.move(steps);
    }
}
