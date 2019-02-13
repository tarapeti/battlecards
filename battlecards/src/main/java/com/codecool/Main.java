package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Play play = new Play();

        int menuChoice = Input.menuInput();
        if (menuChoice == 1) {
            play.play();
        } else if (menuChoice == 0) {
            System.exit(0);
        } else {
            System.out.println("BAD USER, BYE!!!");
            System.exit(0);
        }



        //teszt
        Table table = new Table();


        ArrayList<String> names = new ArrayList<String>();
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name4");



        List<Player> playerList = table.setUpTable(names);

        System.out.println("TTTT");

        Player p = playerList.get(0);
        System.out.println(p.getHand());
        p.setHand(p.getHand(), 2);
        System.out.println(p.getHand());









    }


}