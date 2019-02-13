package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Playerinaction {
    private List<Card> hand;

    public Playerinaction(List<Card> hand) {
        this.hand = hand;
    }

    public List<Card> getHand(){
        return hand;
    }

    public void setHand(List<Card> hand, int index) {
        List<Card> result = new ArrayList<>();
        for (int i = 0; i < hand.size(); i++){
            if(index != i){
                result.add(hand.get(i));
            }
        }
        this.hand = result;
    }
}
