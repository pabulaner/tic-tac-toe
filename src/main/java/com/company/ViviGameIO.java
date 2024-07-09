package com.company;


import java.util.Scanner;

public class ViviGameIO implements GameIO {


    public ViviGameIO() {

    }
    public void printText(String text) {
        System.out.println(text);
    }

    public void printBoard(Board board) {
        for (int i = 0; i < 10; i++) {
            board.getValueAt(i + 1);
        }
    }

    public int getInput() {
        Scanner playerInput = new Scanner(System.in);
        return playerInput.nextInt();
    }


}
