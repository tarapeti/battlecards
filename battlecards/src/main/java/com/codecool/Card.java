package com.codecool;

public class Card {


    private String name;
    private int weight;
    private int maxSpeed;
    private int pplToCarry;
    private int maxDistance;

    public Card(String name, int weight, int maxSpeed, int pplToCarry, int maxDistance) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.pplToCarry = pplToCarry;
        this.maxDistance = maxDistance;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
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
                ", weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", pplToCarry=" + pplToCarry +
                ", maxDistance=" + maxDistance +
                '}';
    }
}
