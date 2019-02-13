package com.codecool;

import java.util.List;

public class Main {
    public static void main(String[] args){

    Table table = new Table();
    //table.play();

    Deck testDeck = new Deck();
    List<Card> testCardList = testDeck.getDeck();
    Comparator testCompare = new Comparator();
    Table testTable = new Table();

    //TEST CompareCards
    Card testWinnerCard = testCompare.compareCards(testCardList,"speed");
    System.out.println(testWinnerCard.getName() + " "+  testWinnerCard.getMaxSpeed());


    //TEST incWinnerPoint
         List<Player> testPlayerlist = table.getPlayerList();
    testCompare.incWinnerPoints(testPlayerlist ,testWinnerCard);

    }
}