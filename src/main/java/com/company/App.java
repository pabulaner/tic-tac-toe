package com.company;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Board board = new ViviBoard();
        GameIO gameIO = new ViviGameIO();
        Game game = new ViviGame();

        gameIO.printBoard(board);
        game.start();

        int playerIndex = gameIO.getInput();

        gameIO.printText("Player 'x' setzt auf " + playerIndex);
        board.setValueAt(playerIndex,'x');






    }
}
