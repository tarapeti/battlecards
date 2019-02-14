package com.codecool;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {


    public static int betType() {

        System.out.println("\n1.Price\n" +
                "2.Speed\n" +
                "3.Passenger capacity\n" +
                "4.Maximum distance");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the parameter's number: ");
        try {
            int n = scan.nextInt();
            if (n == 1 || n == 2 || n == 3 || n == 4) {
                return n;
            }
        } catch (Exception e) {
            return 0;
        }
        return 0;
    }


    public static String handleInput(int n) {
        //gives the sting for the comparator
        String ans = "R";
        if (n == 0) {
            betType();
        } else switch (n) {
            case (1):
                ans = "price";
                break;
            case (2):
                ans = "speed";
                break;
            case (3):
                ans = "carry";
                break;
            case (4):
                ans = "distance";
                break;
        }
        return ans;

    }


    public static ArrayList<String> playInput() {
        ArrayList<String> retList = new ArrayList<>();
        int numP = 0;
        System.out.print("\nNumber of players: \n");
        Scanner scanner = new Scanner(System.in);
        try {
            numP = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (numP <= 4 && numP >= 2) {
            for (int i = 0; i < numP; i++) {
                System.out.print("Player " + (i + 1) + " enter your name: ");
                Scanner scanPlayerName = new Scanner(System.in);
                String name = scanPlayerName.nextLine();
                retList.add(name);
            }
        } else {
            System.out.println("Too few/much players, you can play this game with 2-4 players");
            System.out.println("Please enter the players again");
            playInput();

        }
        return retList;


    }

    public static int menuInput() {
        UI.menuPrint();
        int numP = 0;
        System.out.print("\nEnter your choice: ");
        Scanner scanner = new Scanner(System.in);
        try {
            numP = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numP;

    }

    public static int chooseCard(List<Card> cardList){
        int i = 1;
        UI.printHand(cardList);
        System.out.print("\nPlease choose a card: ");
        Scanner scan = new Scanner(System.in);
        int result = scan.nextInt();
        if (result > cardList.size() || result < 1 ){
            System.out.printf("Wrong input. " + 1 + " - " + cardList.size());
            chooseCard(cardList);
        }
        UI.nextPlyer("Next!");
        return result;

    }
}


