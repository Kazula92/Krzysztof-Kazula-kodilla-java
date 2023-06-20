package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    public List<SudokuElement> sudokuList= new ArrayList<>();

    public SudokuRow(){
    }

    public List<SudokuElement> getEmptyRow() {
        for( int i=0; i < 9; i++) {
            sudokuList.add( new SudokuElement(SudokuElement.EMPTY));
        }
        return new ArrayList<>(sudokuList);
    }

    public List<SudokuElement> getSudokuList() {
        return sudokuList;
    }
}
