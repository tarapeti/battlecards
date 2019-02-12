package com.codecool;
import java.util.*;

public class Hand{



    public List<List<Card>> getDecks(){
        Deck deck = new Deck();
        List<Card> myDeck = deck.getDeck();

        List<List<Card>> result = new ArrayList<>() ;
        List<Card> card5 =new ArrayList<>();
        System.out.println(myDeck.size());
        for (int i = 0; i < myDeck.size(); i++){
            card5.add(myDeck.get(i));
            if (card5.size() == 5){
                result.add(card5);
                card5 =new ArrayList<>();
            }

            System.out.println("");


        }

        //Test
        for(List<Card> cardList : result){
            System.out.println("\nElement of 5: ");
            int i = 0;
            for (Card c : cardList){
                System.out.printf(c.getName() + " - ");
                i++;
            }
            System.out.println("\n\n");

        }
        return result;
    }
}

