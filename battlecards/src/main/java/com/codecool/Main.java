package com.codecool;

import java.util.List;

public class Main {
    public static void main(String[] args){

        Hand hand =new Hand();
        Deck deck = new Deck();
        hand.giveHands(deck.getDeck());
        System.out.println(deck.getDeck());

        System.out.println(hand.getHand());

        //System.out.println(deck);

    }

    }