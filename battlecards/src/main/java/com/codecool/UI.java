package com.codecool;

import java.util.*;

public class UI {

    public static void menuPrint() {
        welcomePrint();
        System.out.println("Choose a number:");
        System.out.println("1.Play a game");
        System.out.println("0.Quit");
    }

    private static void welcomePrint() {
        System.out.println("\t\n" +
                " ___________________________\n" +
                " \\                          \\          ___        ______ |\n" +
                "  \\   ╦ ╦┌─┐┬  ┌─┐┌─┐┌┬┐┌─┐  \\        /   \\___-=0`/|0`/__|\n" +
                "   \\  ║║║├┤ │  │  │ ││││├┤    \\_______\\          / | /    )\n" +
                "   /  ╚╩╝└─┘┴─┘└─┘└─┘┴ ┴└─┘   /        `/-==__ _/__|/__=-|\n" +
                "  /__________________________/         *             \\ | |\n" +
                "                                                     (o)");


    }

    public static void printHand(List<Card> hand) {
        /*System.out.println("Name: ");
        System.out.println("Price: ");
        System.out.println("Speed: ");
        System.out.println("Name: ");
        System.out.println("Name: ");*/
        for (Card c : hand) {
            System.out.println(c + " ");
        }
        /*name>E–8 JSTARS</name>
        <price>270</price>
        <speed>945</speed>
        <carry>19</carry>
        <distance>9650</distance>*/


    }

    public static void flushCMD() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static boolean hasDuplicate(ArrayList<Integer> items) {
        Set<Integer> appeared = new HashSet<>();
        for (int item : items) {
            if (!appeared.add(item)) {
                return true;
            }
        }
        return false;
    }

    private static List<Player> winner(List<Player> player) {
        List<Player> winners = new ArrayList<>();
        ArrayList<Integer> points = new ArrayList<>();

        for (int i = 0; i < player.size(); i++) {
            points.add(player.get(i).getPoint());
        }
        ArrayList<Integer> backUp = new ArrayList<>(points);
        Collections.sort(points);
        Collections.reverse(points);
        if(points.get(0).equals(points.get(1))){
           int tie1 = backUp.indexOf(points.get(0));
           int tie2 = backUp.indexOf(points.get(1));

           winners.add(player.get(tie1));
           winners.add(player.get(tie2));
        }
        if(!(points.get(0).equals(points.get(1)))){
            int tie1 = backUp.indexOf(points.get(0));
            winners.add(player.get(tie1));
        }
        return winners;

    }
    public static void displayWinner(List<Player> winners){
        List<Player> toPrint = winner(winners);
        if(toPrint.size() == 2){
            System.out.println("We got a tie game");
            for(Player win :winners){
                System.out.println(win.getName());
            }
            System.out.println("Are the winners congrats!");
        }
        if (toPrint.size() == 1 ){
            System.out.println(toPrint.get(0).getName() +" is the winner congrats!");

        }
        if(toPrint.size()>3){
            System.out.println("RIP");
            throw new ImposibleError();
        }


    }


}

