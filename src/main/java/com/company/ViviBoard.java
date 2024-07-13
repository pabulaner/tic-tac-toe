package com.company;

public class ViviBoard implements Board {

    public char value;
    private char[] field;
    static int totalFieldNumber;
    private static int round;

    public ViviBoard() {
        totalFieldNumber = 9;
        field = new char[totalFieldNumber];
        for (int i = 0; i < totalFieldNumber; i++) {
            field[i] = '-';
        }
    }

    public char getValueAt(int index) {
        if (index <= totalFieldNumber && index > 0) {
            //System.out.println(field[index - 1] + " " + index);
            return field[index - 1];
        }
        return '-';
    }

    public void setValueAt(int index, char value) {
        if (index > 0 && index <= totalFieldNumber) {
            if(value == 'x' || value == 'o' || value == '-') {
                field[index - 1] = value;
                round++;
                System.out.println("Player " + field[index - 1] + " has chosen " + index + " in round" + round);
            } else {
                System.out.println("invalid value");
            }
        } else {
            System.out.println("invalid index");
        }
    }
    public void clear() {
        for (int i = 0; i < totalFieldNumber; i++) {
            field[i] = '-';
        }
    }

}

