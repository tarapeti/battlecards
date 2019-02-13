package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Input inp = new Input();
        Table table = new Table();
        ArrayList<String> strings = inp.playInput();
        table.setUpTable(strings);


        //TEST incWinnerPoint
    //testCompare.incWinnerPoints( ,testWinnerCard);
    }
}