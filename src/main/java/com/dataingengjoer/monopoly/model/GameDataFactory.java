package com.dataingengjoer.monopoly.model;

import com.dataingengjoer.monopoly.model.cards.Card;
import com.dataingengjoer.monopoly.model.tiles.*;

import java.util.List;

public class GameDataFactory {

    public Deck createDeck() {
        List<Card> cards = CardLoader.loadCards("cards.json");
        return new Deck(cards);
    }

    public Board createBoard(Deck deck) {
        Board board = new Board();

        board.addTile(new GoTile("Go"));
        board.addTile(new PropertyTile("Mediterranean Avenue", 60));
        board.addTile(new CardTile("Community Chest", deck));
        board.addTile(new PropertyTile("Baltic Avenue", 60));
        board.addTile(new TaxTile("Income Tax", 200));
        board.addTile(new PropertyTile("Reading Railroad", 200));
        board.addTile(new PropertyTile("Oriental Avenue", 100));
        board.addTile(new CardTile("Chance", deck));
        board.addTile(new PropertyTile("Vermont Avenue", 100));
        board.addTile(new PropertyTile("Connecticut Avenue", 120));
        board.addTile(new JailTile("Jail"));

        return board;
    }
}
