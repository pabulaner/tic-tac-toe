package com.company;

import java.util.Scanner;

public class ViviGameIO implements GameIO {
    private char[] player;


    public ViviGameIO() {
        player = new char[] {'x','o'};
    }
    public void printText(String text) {
        System.out.println(text);
    }

    public void printBoard(Board board) {
        
    }

    public int getInput() {
        return 4;
    }


}
