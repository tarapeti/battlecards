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

    }
}