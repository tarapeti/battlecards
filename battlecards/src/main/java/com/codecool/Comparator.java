package com.codecool;

import java.util.*;

public class Comparator {

    //Which is the winning card :
    public Card compareCards(List<Card> selectedCards, String compareBy){
        Card winnerCard = selectedCards.get(0);
        switch (compareBy) {
            case ("price"):
                for (Card card : selectedCards) {
                    if (card.getPrice() > winnerCard.getPrice())
                        winnerCard = card;
                }
                break;
            case ("speed"):
                for (Card card : selectedCards) {
                    if (card.getMaxSpeed() > winnerCard.getMaxSpeed())
                        winnerCard = card;
                }
                break;
            case ("carry"):
                for (Card card : selectedCards) {
                    if (card.getPplToCarry() > winnerCard.getPplToCarry())
                        winnerCard = card;
                }
                break;
            case ("distance"):
                for (Card card : selectedCards) {
                    if (card.getMaxDistance() > winnerCard.getMaxDistance())
                        winnerCard = card;
                }
                break;
        }
        return winnerCard;
    }
    //Who has the winning card + increase poins for winner :
    public void incWinnerPoints(List<Player> players, Card winnerCard){
        for (Player player : players){
            for (Card card : player.getHand()){
                if (winnerCard.getName().equals(card.getName())){
                    System.out.println(winnerCard.getName() + " = " + card.getName());
                    System.out.println(player.getName() + "'s card won.");
                    player.increasePoint();
                    System.out.println(player.getName() + " has " + player.getPoint() + " point(s)." );
                }
            }
        }
    }

    public List<Player> removePlayedCards(List<Player> players, List<Card> selectedCards){
        int[] result = new int[20]; //Change it to 3
        for (Player player : players){
            for (Card card : player.getHand()){
                for (Card sCard : selectedCards){
                    if (card.getName() == sCard.getName()){
                        System.out.printf(card.getName() + " = " + sCard.getName());
                    }
                }
            }
            System.out.println("");
        }
        return null;
    }
}
