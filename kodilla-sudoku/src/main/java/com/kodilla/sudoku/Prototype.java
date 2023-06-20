package com.kodilla.sudoku;

public class Prototype<T> implements Cloneable{
//implementowanie interfejsu Cloneable w celu stworzenia klonu obiektu klasy

    @Override
    protected T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
