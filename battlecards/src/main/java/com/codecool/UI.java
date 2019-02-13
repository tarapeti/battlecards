package com.codecool;

import java.util.List;

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
        for (Card c : hand) {
            System.out.println(c);
        }


    }
}
