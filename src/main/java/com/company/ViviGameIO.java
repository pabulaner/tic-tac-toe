package com.company;

import java.util.Scanner;

public class ViviGameIO implements GameIO, Game{
    private char playerX;
    private char playerO;

    public ViviGameIO() {
        playerX = 'x';
        playerO = 'o';
    }

    @Override
    public void printText(String text) {

    }

    public void printBoard(Board board) {
        board.clear();
    }

    @Override
    public int getInput() {
        Scanner userX = new Scanner(System.in);
        System.out.println("userX" + userX);
        int getX = userX.nextInt();
        System.out.println("userX is setting " + getX);

        Scanner userO = new Scanner(System.in);
        System.out.println("userO" + userO);
        int getO = userO.nextInt();
        System.out.println("userX is setting " + getO);
        return getX;
    }

    @Override
    public void start() {
        playerX = 'x';
        playerO = 'o';
    }

    @Override
    public boolean hasWon(char player) {
        return false;
    }

    @Override
    public boolean isTie() {
        return false;
    }
}
