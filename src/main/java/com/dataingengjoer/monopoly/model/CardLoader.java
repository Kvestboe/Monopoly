package com.dataingengjoer.monopoly.model;

import com.dataingengjoer.monopoly.model.cards.Card;
import com.dataingengjoer.monopoly.model.cards.JailCard;
import com.dataingengjoer.monopoly.model.cards.MoneyCard;
import com.dataingengjoer.monopoly.model.cards.MoveCard;
import com.google.gson.*;
import java.util.*;

public class CardLoader {
    public static List<Card> loadCards(String json) {
        Gson gson = new Gson();
        JsonArray arr = JsonParser.parseString(json).getAsJsonArray();
        List<Card> cards = new ArrayList<>();

        for (JsonElement elem : arr) {
            JsonObject obj = elem.getAsJsonObject();
            String type = obj.get("type").getAsString();
            String description = obj.get("description").getAsString();

            switch (type) {
                case "moneyCard":
                    int amount = obj.get("amount").getAsInt();
                    cards.add(new MoneyCard(description, amount));
                    break;
                case "moveCard":
                    int steps = obj.get("steps").getAsInt();
                    cards.add(new MoveCard(description, steps));
                    break;
                case "jailCard":
                    cards.add(new JailCard(description));
                    break;
                default:
                    throw new RuntimeException("Unknown card type: " + type);
            }
        }
        return cards;
    }
}
