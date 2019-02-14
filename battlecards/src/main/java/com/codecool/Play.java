package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Play {
    public void play() {
        Table table = new Table();
        ArrayList<String> playerNames = Input.playInput();
        List<Player> players = table.setUpTable(playerNames);

        for (int i = 0; i < 5; i++){
            round(players);
        }

        UI.displayWinner(players);

    }

    public void round(List<Player> players) {
        Comparator comp = new Comparator();
        int input =  Input.betType();
        String betType = Input.handleInput(input);
        List<Card> selected = new ArrayList<>();
        int choice= 1;
        int[] choices = new int[players.size()];
        for(int i = 0; i < players.size(); i++){
            System.out.println("\n" + players.get(i).getName() +"'s deck: ");
            choice = Input.chooseCard(players.get(i).getHand());
            selected.add(players.get(i).getHand().get(choice-1));
            choices[i] = choice;
        }
        Card winnerCard = comp.compareCards(selected,betType);
        comp.incWinnerPoints(players, winnerCard);
        for (int i = 0; i < players.size(); i++){
            players.get(i).setHand(players.get(i).getHand(),choices[i]-1);
        }

    }

}

