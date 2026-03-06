package com.dataingengjoer.monopoly.model.spaces;

import com.dataingengjoer.monopoly.model.Player;

public class JailSpace extends Space {
    public JailSpace(String name) {
        super(name);

    }

    @Override
    public void onLand(Player player) {
        player.arrest();
    }
}
