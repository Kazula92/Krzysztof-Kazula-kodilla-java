package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype<SudokuBoard> {
    public final static int MIN_INDEX=0;
    public final static int MAX_INDEX=8;

    public List<SudokuRow> sudokuBoardList= new ArrayList<SudokuRow>();

    public SudokuBoard() {
    }

    public void createBoard() {

        for (int i= 0; i < 9; i++) {
            sudokuBoardList.add(new SudokuRow());
        }
        for (SudokuRow row: sudokuBoardList) {
            row.getEmptyRow();
        }
    }

    public void addSudoku (int x, int y, int v) {
        sudokuBoardList.get(x-1).getSudokuList().set(y-1,new SudokuElement(v));
    }

    public List<SudokuRow> getSudokuBoardList() {
        return sudokuBoardList;
    }

    public SudokuBoard xCopy() throws CloneNotSupportedException {
        SudokuBoard backtrackBoard= super.clone();
        backtrackBoard.sudokuBoardList= new ArrayList<>();
        for (SudokuRow row: sudokuBoardList) {
            SudokuRow backtrackRow= new SudokuRow();
            for (SudokuElement element: row.getSudokuList()) {
                backtrackRow.getSudokuList().add(element);
            }
            backtrackBoard.getSudokuBoardList().add(backtrackRow);
        }
        return backtrackBoard;
    }

    @Override
    public String toString() {
        StringBuilder result= new StringBuilder();
        for ( int j= MIN_INDEX; j <= MAX_INDEX; j++ ) {
            result.append("|");
            for (int k= MIN_INDEX; k <= MAX_INDEX; k++) {
                if (sudokuBoardList.get(j).getSudokuList().get(k).getValue() == -1) {
                    result.append("-");
                } else {
                    result.append((sudokuBoardList.get(j).getSudokuList().get(k).getValue()));
                }
                result.append("|");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
