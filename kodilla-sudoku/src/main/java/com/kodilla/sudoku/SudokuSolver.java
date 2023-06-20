package com.kodilla.sudoku;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


public class SudokuSolver {

    private final static int FIRST_VALUE= 1;
    private final static int LAST_VALUE= 10;
    private final static int UNIT_INDEX= 2;
    private final static int LAST_INDEX= 9;

    private SudokuBoard backtrackSudokuBoard;

    public SudokuSolver(SudokuBoard sudokuBoard) {
        this.backtrackSudokuBoard= sudokuBoard;
    }

    public SudokuBoard solveSudoku() throws CloneNotSupportedException, IllegalAccessException {
        if (!solveBoard()) {
            throw new IllegalAccessException("No solution possible");
        }
        return backtrackSudokuBoard;
    }

    private boolean solveBoard() {
        for (int i=0; i < LAST_INDEX; i++) {
            for (int j=0; j < LAST_INDEX; i++) {
                if (emptyField (i,j)) {
                    return solveField (i,j);
                }
            }
        }
        return true;
    }

    private boolean emptyField(int x, int y) {
        return backtrackSudokuBoard.getSudokuBoardList().get(x).getSudokuList().get(y).getValue() == SudokuElement.EMPTY;
    }

    private boolean solveField( int x, int y) {
        List<Integer> values= IntStream.range(FIRST_VALUE, LAST_VALUE).boxed().collect(toList());
        Random random= new Random();
        do {
            int index= random.nextInt(values.size());
            int z= values.remove(index);
            if(possibleFill(x,y,z)) {
                backtrackSudokuBoard.getSudokuBoardList().get(x).getSudokuList().get(y).setValue(z);
                if (solveBoard()) {
                    return true;
                }
                backtrackSudokuBoard.getSudokuBoardList().get(x).getSudokuList().get(y).setValue(SudokuElement.EMPTY);
            }
        } while (!values.isEmpty());
            return false;
    }

    private boolean possibleFill (int x, int y, int value) {
        return possibleInLine (x, y, value) && possibleUnit (x, y, value);
    }

    private boolean possibleInLine (int x, int y, int value) {
        for (int i= 0; i<LAST_INDEX; i++) {
            if (
                    backtrackSudokuBoard.getSudokuBoardList().get(i).getSudokuList().get(y).getValue() == value ||
                            backtrackSudokuBoard.getSudokuBoardList().get(x).getSudokuList().get(i).getValue() == value
            ) return false;
        }
        return true;
    }

    private boolean possibleUnit (int x, int y, int value) {
        int sX= x-x%UNIT_INDEX;
        int sY= y-y%UNIT_INDEX;
        for (int i=0; i< UNIT_INDEX; i++) {
            for ( int j=0; j< UNIT_INDEX; i++) {
                if ( backtrackSudokuBoard.getSudokuBoardList().get(sX+i).getSudokuList().get(sY+j).getValue() == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
