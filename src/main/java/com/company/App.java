package com.company;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Board board = new ViviBoard();
        GameIO gameIO = new ViviGameIO();
        Game game = new ViviGame(board);
        boolean xoro = false;
        char player;

        gameIO.printBoard(board);

        for (int i = 1; i <= 9; i++) {
            gameIO.printText("\nchooses index 1 till 9");
            int inputPlayer = gameIO.getInput();
            if (board.getValueAt(inputPlayer) == '-') {
                if (xoro == false) {
                    player = 'x';
                } else {
                    player = 'o';
                }
                board.setValueAt(inputPlayer, player);

                game.hasWon(player);
                game.isTie();

                gameIO.printBoard(board);


                xoro = !xoro;

            } else {
                System.out.println("field is not '-'");
            }

        }





    }
}
