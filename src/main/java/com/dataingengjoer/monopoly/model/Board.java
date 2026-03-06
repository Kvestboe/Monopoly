package com.dataingengjoer.monopoly.model;

import com.dataingengjoer.monopoly.model.Space;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Space> spaces;

    public Board() {
        this.spaces = new ArrayList<>();
    }

    public Space getPosition(int position) {
        return spaces.get(position);
    }
}
