package com.company;

public class ViviGame implements Game {

    private final ViviGameIO gameIO;
    private Board board;

    public ViviGame(Board board) {
        this.board = board;
        gameIO = new ViviGameIO();
    }

    public void start() {

    }

    public boolean hasWon(char player) {
        for (int j = 1; j < 9; j+=3) {
            if (board.getValueAt(j) == board.getValueAt(j + 1) && board.getValueAt(j + 1) == board.getValueAt(j + 2) && board.getValueAt(j) != '-') {
                System.out.println(board.getValueAt(j) + " hat gewonnen");
            }
        }

        for (int k = 1; k < 9; k++) {
            if (board.getValueAt(k) == board.getValueAt(k + 3) && board.getValueAt(k + 3) == board.getValueAt(k + 6) && board.getValueAt(k) != '-') {
                System.out.println(board.getValueAt(k) + " hat gewonnen");
            }
        }

        if (board.getValueAt(1) == board.getValueAt(5) && board.getValueAt(5) == board.getValueAt(9) && board.getValueAt(1) != '-') {
            System.out.println(board.getValueAt(1) + " hat gewonnen");
        }
        if (board.getValueAt(3) == board.getValueAt(5) && board.getValueAt(5) == board.getValueAt(7) && board.getValueAt(3) != '-') {
            System.out.println(board.getValueAt(3) + " hat gewonnen");
        }
        return true;
    }

    public boolean isTie() {
        for (int i = 1; i < 10; i++) {
            if (board.getValueAt(i) == '-') {
                return false;
            }
        }
        System.out.println("tie");
        return true;
    }
}
