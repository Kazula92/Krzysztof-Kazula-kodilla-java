package com.kodilla.sudoku;

import java.util.List;

public class Game {

    private final SudokuBoard sudokuBoard= new SudokuBoard();

    public boolean resolveSudoku() {
        sudokuBoard.createBoard();
        fillSudoku();
        solveSudoku();
        return true;
    }

    private void fillSudoku() {
        SudokuService.welcome();
        System.out.println(sudokuBoard);
        List<String> listInput= SudokuService.getInput();
        for(String input: listInput) {
            sudokuBoard.addSudoku(Character.getNumericValue(input.charAt(0)), Character.getNumericValue(input.charAt(1))
            ,Character.getNumericValue(input.charAt(2)));
            System.out.println(sudokuBoard);
        }
    }

    private void solveSudoku() {
        SudokuService.solutionOfQuestion();
        try {
            SudokuSolver sudokuSolver= new SudokuSolver(sudokuBoard.xCopy());
            SudokuBoard result= sudokuSolver.solveSudoku();
            System.out.println(result);

        } catch (CloneNotSupportedException | IllegalAccessException e) {
            SudokuService.cloneBoardError();
        }
    }
}
