package com.codecool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Table {
    //stores the cards on the table
    public Table() {
    }

    public List<Player> setUpTable(ArrayList<String> players){
        Deck deck = new Deck();
        Hand hand = new Hand();
        List<Player> retList= new ArrayList<>();
        hand.giveHands(deck.getDeck());
        for (int i = 0; i < players.size(); i++) {
            Player player = new Player((hand.getHand().get(i)),0,(i+1),players.get(i));
            retList.add(player);
        }

        return retList;


    }
}
