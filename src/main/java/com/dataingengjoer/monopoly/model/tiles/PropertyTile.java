package com.dataingengjoer.monopoly.model.spaces;

import com.dataingengjoer.monopoly.model.Player;

public class PropertySpace extends Space {
    private int price;
    private Player owner;

    public PropertySpace(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public void onLand(Player player) {
        if (owner == null) {
            // TODO: Offer to buy the property
        } else if (owner != player) {
            int rent = calculateRent();
            player.pay(rent);
            owner.receive(rent);
        }
    }

    public int calculateRent() {
        return price / 10;
    }

    public void setOwner(Player player) {
        owner = player;
    }

    public boolean isOwned() {
        return owner != null;
    }
}
