package com.codecool;

import java.util.HashMap;
import java.util.List;

public class Table {
    //stores the cards on the table
    int numOfPlayers;



    public Table() {
    }

    public void play(){
        Deck deck = new Deck();
        Hand hand = new Hand();
        hand.giveHands(deck.getDeck());
        Player player = new Player((hand.getHand().get(0)),0,1,"Gábor");
        System.out.println(player);
        System.out.println(hand.getHand().get(0).get(0).getName());

    }
}
