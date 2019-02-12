package com.codecool;

import java.util.Collections;
import java.util.List;

public class Deck {
    private XMLParser parser = new XMLParser();
    private List<Card> deck = parser.xmlParser();
    private int Size = deck.size();


    public List<Card> getDeck() {
        shuffleDeck();
        return deck;
    }

    private void shuffleDeck(){


        Collections.shuffle(this.deck);


    }


}
