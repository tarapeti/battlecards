package com.codecool;


import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CardIterator implements Iterator {
    public List<Player> playerList;
    private Integer index = 0;

    public CardIterator(List<Player> playerList) {
        this.playerList = playerList;
    }

    @Override
    public boolean hasNext() {
        if (playerList.size() == 0) {

            return false;

        } else {
            while (index < playerList.size()) {
                if (index < playerList.size()) {
                    return true;
                } else {
                    index++;

                }
            }
            return false;
        }
    }
    @Override

    public Player next() {
        if (playerList.size() == 0) {
            throw new NoSuchElementException();

        } else {

            while (this.hasNext()) {
                return playerList.get(index++);
            }
        }

        throw new NoSuchElementException();
    }

    @Override
    public void remove (){
        this.remove();
    }

}