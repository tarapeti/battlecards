package com.codecool;

import java.util.ArrayList;

public class Play {
    public void play() {
        Table table = new Table();
        ArrayList<String> playerNames = Input.playInput();
        table.setUpTable(playerNames);


    }



}