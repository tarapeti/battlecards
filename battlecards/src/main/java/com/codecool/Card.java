package com.codecool;

public class Card {


    private String name;
    private int price;
    private int maxSpeed;
    private int pplToCarry;
    private int maxDistance;

    public Card(String name, int price, int maxSpeed, int pplToCarry, int maxDistance) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.pplToCarry = pplToCarry;
        this.maxDistance = maxDistance;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPplToCarry() {
        return pplToCarry;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", $$$=" + price +
                ", maxSpeed=" + maxSpeed +
                ", pplToCarry=" + pplToCarry +
                ", maxDistance=" + maxDistance +
                '}';
    }

}
