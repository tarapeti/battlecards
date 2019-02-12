package com.codecool;
import java.util.ArrayList;
import java.util.List;

public class Hand {
    List<List<Card>> hand = new ArrayList<>();


    public void giveHands(List<Card> deck) {
        List<Card> deck1Deck = deck;
        List<Card> smallDeck = new ArrayList<>();
        for(int i = 0; i < deck1Deck.size(); i++){
            smallDeck.add(deck1Deck.get(i));
            if(smallDeck.size() == 5){
                hand.add(smallDeck);
                smallDeck = new ArrayList<>();
            }
        }
    }


    public List<List<Card>> getHand() {
        return hand;
    }
}
