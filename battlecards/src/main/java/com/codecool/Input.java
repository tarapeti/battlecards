package com.codecool;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Input {
    public void chooseNumOfPlayers(){


    }
    public void chooseName(){

    }

    public int betType() {
        System.out.println("1.Price\n" +
                "2.Speed\n" +
                "3.Passenger capacity\n" +
                "4.Maximum distance");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the parameter's number: ");
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





        public String handleInput(int n ){
        String result = "R";
        //gives the sting for the comparator
            if(n == 0){
                betType();
            }
            else{

                switch (n) {
                    case (1):
                        result =  "price";
                    break;
                    case (2):
                        result = "speed";
                    break;
                    case (3):
                        result = "carry";
                    break;
                    case (4):
                        result = "distance";
                    break;
                }

            }
            return result;

    }





    public void betCard(){

    }
}
