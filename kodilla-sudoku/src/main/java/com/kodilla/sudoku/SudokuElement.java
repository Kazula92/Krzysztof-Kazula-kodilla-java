package com.kodilla.sudoku;

public class SudokuElement {

    public int value;
    public static int EMPTY= -1;

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SudokuElement{" +
                "value=" + value +
                '}';
    }
}
