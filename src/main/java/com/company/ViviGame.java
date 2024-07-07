package com.company;



public class ViviGame implements Game {

    private char[] player;

    public ViviGame() {
        player = new char[]{'x','o'};
    }

    public void start() {

    }

    public boolean hasWon(char player) {

        return true;
    }

    public boolean isTie() {
        return false;
    }
}
