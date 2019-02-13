package com.codecool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Table {
    //stores the cards on the table
    int numOfPlayers;
    List<Player> playerList= new ArrayList<>();

    public Table() {
    }

    public void play(){
        Deck deck = new Deck();
        Hand hand = new Hand();
        hand.giveHands(deck.getDeck());
        Player player = new Player((hand.getHand().get(0)),0,1,"Gábor");
        //System.out.println(player);
        //System.out.println(hand.getHand().get(0).get(0).getName());

    }
    public List<Player> getPlayerList(){
        Deck deck = new Deck();
        Hand hand = new Hand();
        hand.giveHands(deck.getDeck());
        for(List<Card> list : hand.getHand()){
            for (Card c : list){
                System.out.print(c.getName() + " - ");
            }
            System.out.println();

        }


        Player player = new Player((hand.getHand().get(0)),0,1,"Gábor");
        Player player1 = new Player((hand.getHand().get(1)),0,1,"Gergő");
        Player player2 = new Player((hand.getHand().get(2)),0,1,"Peti");
        Player player3 = new Player((hand.getHand().get(3)),0,1,"Bence");
        this.playerList.add(player);
        this.playerList.add(player1);
        this.playerList.add(player2);
        this.playerList.add(player3);
       // System.out.println(player.getHand());
        //System.out.println(player1.getHand());

        return playerList;
    }
}
