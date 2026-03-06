package com.dataingengjoer.monopoly.model;

public class Player {
    private String name;
    private int money;
    private int position;
    private boolean inJail;

    public Player(String name) {
        this.name = name;
        this.money = 200;
        this.position = 0;
        this.inJail = false;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getPosition() {
        return position;
    }

    public boolean isInJail() {
        return inJail;
    }

    public void move(int steps) {
        position += steps;
    }

    public void pay(int amount) {
        if (money > amount) {
            money -= amount;
        }
    }

    public void receive(int amount) {
        money += amount;
    }

    public void arrest() {
        inJail = true;
    }

    public void release() {
        inJail = false;
    }
}
