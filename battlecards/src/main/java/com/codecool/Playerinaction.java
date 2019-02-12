package com.codecool;

import java.util.List;

public class Playerinaction {
    private List<Card> hand;

    public Playerinaction(List<Card> hand) {
        this.hand = hand;
    }

    public List<Card> getHand(){
        return hand;
    }

}
