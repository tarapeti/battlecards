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
        System.out.println("original deck: ");
        for (Card c : deck){
            System.out.printf(c.getName() + " - ");
        }

        Collections.shuffle(this.deck);

        System.out.println("\n\nshuffled deck: ");
        for (Card c : deck){
            System.out.printf(c.getName() + " - ");
        }
    }


}
