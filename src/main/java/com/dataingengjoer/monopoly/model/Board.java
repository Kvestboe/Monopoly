package com.dataingengjoer.monopoly.model;

import com.dataingengjoer.monopoly.model.tiles.CardTile;
import com.dataingengjoer.monopoly.model.tiles.GoTile;
import com.dataingengjoer.monopoly.model.tiles.PropertyTile;
import com.dataingengjoer.monopoly.model.tiles.Tile;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Tile> tiles;

    public Board() {
        this.tiles = new ArrayList<>();
    }

    public Tile getPosition(int position) {
        return tiles.get(position);
    }

    public void addTile(Tile space) {
        tiles.add(space);
    }

    public int size() {
        return tiles.size();
    }
}
