package com.dataingengjoer.monopoly.model.cards;

import com.dataingengjoer.monopoly.model.Player;

public class MoneyCard extends Card {
    private int amount;

    public MoneyCard(String description, int amount) {
        super(description);
        this.amount = amount;
    }

    @Override
    public void execute(Player player) {
        if (amount >= 0) {
            player.receive(amount);
        } else {
            player.pay(-amount);
        }
    }
}
