package com.dataingengjoer.monopoly.model.tiles;

import com.dataingengjoer.monopoly.model.Deck;
import com.dataingengjoer.monopoly.model.Player;
import com.dataingengjoer.monopoly.model.cards.Card;

public class CardTile extends Tile {
    private Deck deck;

    public CardTile(String name, Deck deck) {
        super(name);
        this.deck = deck;
    }

    @Override
    public void onLand(Player player) {
        Card card = deck.draw();
        card.execute(player);
    }
}
