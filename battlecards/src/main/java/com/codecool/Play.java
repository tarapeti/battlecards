package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Play {
    int[] playerNO;
    int nowPlay =0;

    public void play() {
        Table table = new Table();
        ArrayList<String> playerNames = Input.playInput();
        List<Player> players = table.setUpTable(playerNames);

        playerNO = new int[players.size()];
        for (int i = 0; i < players.size() ; i++) {
            playerNO[i] = i;
        }

        for (int i = 0; i < 5; i++){
            round(players);
        }



        UI.displayWinner(players);

    }

    public void round(List<Player> players) {
        Comparator comp = new Comparator();
        String nowPlays = players.get(playerNO[nowPlay]).getName();
        System.out.println("Now " + nowPlays + " has to choose!" );

        this.nowPlay = players.get(nowPlay).getPlayerNo();
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

