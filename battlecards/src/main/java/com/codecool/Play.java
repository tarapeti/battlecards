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

        UI.flushCMD();
    }

    public void round(List<Player> players) {
        Comparator comp = new Comparator();
        int input =  Input.betType();
        String betType = Input.handleInput(input);
        List<Card> selected = new ArrayList<>();
        List<Player> backup = new ArrayList<>(players);
        int choice= 1;
        for(Player player : players){
            System.out.println(player.getName());
            choice = Input.chooseCard(player.getHand());
            selected.add(player.getHand().get(choice-1));


        }

        Card winnerCard = comp.compareCards(selected,betType);
        comp.incWinnerPoints(backup, winnerCard);












    }

}

