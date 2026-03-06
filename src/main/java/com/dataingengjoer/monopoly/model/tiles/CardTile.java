package com.dataingengjoer.monopoly.model.spaces;

import com.dataingengjoer.monopoly.model.Deck;
import com.dataingengjoer.monopoly.model.Player;
import com.dataingengjoer.monopoly.model.cards.Card;

public class CardSpace extends Space {
    private Deck deck;

    public CardSpace(String name, Deck deck) {
        super(name);
        this.deck = deck;
    }

    @Override
    public void onLand(Player player) {
        Card card = deck.draw();
        card.execute(player);
    }
}
