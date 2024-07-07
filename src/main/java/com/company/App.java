package com.company;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Board board = new ViviBoard();
        GameIO gameIO = new ViviGameIO();
        Game game = new ViviGame();

        gameIO.printBoard(board);
        gameIO.printText("Player 'x' please enter your field from 1 till 9 ");
        Scanner inputPlayerX1 = new Scanner(System.in);
        int inputIntX1 = inputPlayerX1.nextInt();
        board.setValueAt(inputIntX1,'x');
        gameIO.printBoard(board);

        gameIO.printText("Player 'o' please enter your field from 1 till 9 ");
        Scanner inputPlayerO1 = new Scanner(System.in);
        int inputIntO1 = inputPlayerO1.nextInt();
        board.setValueAt(inputIntO1,'o');
        gameIO.printBoard(board);

        gameIO.printText("Player 'x' please enter your field from 1 till 9 ");
        Scanner inputPlayerX2 = new Scanner(System.in);
        int inputIntX2 = inputPlayerX2.nextInt();
        board.setValueAt(inputIntX2,'x');
        gameIO.printBoard(board);
    }
}
