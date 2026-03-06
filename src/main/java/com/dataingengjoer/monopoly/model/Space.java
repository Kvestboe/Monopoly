package com.dataingengjoer.monopoly.model;

public abstract class Space {
    private String name;
    private int position;

    public Space(String name, int position) {
        this.name = name;
        this.position = position;
    }
}
