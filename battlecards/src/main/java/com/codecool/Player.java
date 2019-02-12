package com.codecool;

import java.util.List;

public class Player extends Playerinaction {
    private int point;
    private int playerNo;
    private String name;

    public Player(List<Card> handint,int point,int playerNo, String name) {
        super(handint);
        this.point = point;
        this.playerNo = playerNo;
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public int getPlayerNo() {
        return playerNo;
    }

    public String getName() {
        return name;
    }
}
