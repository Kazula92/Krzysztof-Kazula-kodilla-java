package com.kodilla;

import com.kodilla.sudoku.Game;

public class Main {

    public static void main(String[] args) {

        boolean gameFinished= false;
        while (gameFinished) {
            Game sudokuGame= new Game();
            gameFinished= sudokuGame.resolveSudoku();
        }

    }
}