package com.dataingengjoer.monopoly.model;

import com.dataingengjoer.monopoly.model.cards.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        Card card = cards.remove(0);
        cards.add(card);
        return card;
    }
}
