package com.kodilla.exception.test;

import com.kodilla.exception.test.SecondChallenge;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        double x= 3.0;
        double y= 1.5;


        try{
            secondChallenge.probablyIWillThrowException(x,y);
        } catch (Exception e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
