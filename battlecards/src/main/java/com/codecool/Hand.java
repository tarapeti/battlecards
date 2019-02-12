package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    List<List<Card>> hand = new ArrayList<>();

    public  void giveHands(List<Card> deck) {
        List<Card> deck1Deck = deck;
        List<Card> smallDeck = new ArrayList<>();
        for(int i = 0; i < deck1Deck.size();){
            smallDeck.add(deck1Deck.get(i));
                if(smallDeck.size() == 5){
                    hand.add(smallDeck);
                    i = i + 5;
                    smallDeck.clear();
                    

                }
                else {
                    i++;
                }

        }
    }

    public List<List<Card>> getHand() {
        return hand;
    }
}
