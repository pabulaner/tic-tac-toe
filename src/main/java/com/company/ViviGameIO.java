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
            if (i > 0 && i < 4) {
                if (i == 1) {
                    System.out.print("|" + board.getValueAt(i) + " ");
                }
                if (i == 2) {
                    System.out.print(board.getValueAt(i) + " ");
                }
                if (i == 3) {
                    System.out.print(board.getValueAt(i) + "|");
                    System.out.print("\n");
                }
            }
            if (i > 3 && i < 7) {
                if (i == 4) {
                    System.out.print("|" + board.getValueAt(i) + " ");
                }
                if (i == 5) {
                    System.out.print(board.getValueAt(i) + " ");
                }
                if (i == 6) {
                    System.out.print(board.getValueAt(i) + "|");
                    System.out.print("\n");
                }
            }
            if (i > 6 && i < 10) {
                if (i == 7) {
                    System.out.print("|" + board.getValueAt(i) + " ");
                }
                if (i == 8) {
                    System.out.print(board.getValueAt(i) + " ");
                }
                if (i == 9) {
                    System.out.print(board.getValueAt(i) + "|");
                    System.out.print("\n");
                }
            }

        }
    }

    public int getInput() {
        Scanner playerInput = new Scanner(System.in);
        return playerInput.nextInt();
    }


}
