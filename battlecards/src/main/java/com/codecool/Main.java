package com.codecool;

import java.util.List;

public class Main {
    public static void main(String[] args){
        XMLParser parser = new XMLParser();
        List<Card> test = parser.xmlParser();
        System.out.println(test.get(0).getName());
    }

    }