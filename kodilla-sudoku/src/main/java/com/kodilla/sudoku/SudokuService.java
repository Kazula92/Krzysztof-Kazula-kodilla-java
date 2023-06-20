package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuService {

    private static final Scanner scanner= new Scanner(System.in);

    public static List<String> getInput() {
        List<String> listInput= new ArrayList<>();
        System.out.println("Insert your details");
        listInput.add(numberCheck(scanner.nextLine()));
        return nextInput(listInput);
    }

    public static List<String> nextInput(List<String> listInput) {
        System.out.println("Please insert Your next input. If not press \"n\".");
        String input= scanner.nextLine();
        while(input.equals("n")) {
            listInput.add(numberCheck(input));
            System.out.println("Please insert Your next input. If not press \"n\".");
            input= scanner.nextLine();
        }
        return listInput;
    }
    public static String numberCheck (String supplement) {
        while (!supplement.matches("[1-9]{3}")) {
            System.out.println("Wrong input - only numbers from 1 to 9");
            supplement= scanner.nextLine();
        }
        return supplement;
    }

    public static void welcome() {
        System.out.println("Welcome to Sudoku");
    }

    public static void solutionOfQuestion() {
        do{
            System.out.println("Write \"SOLUTION\" to get a solution");
        }while(!scanner.nextLine().equals("SOLUTION"));
    }

    public static void cloneBoardError() {
        System.out.println("Unable to clone board");
    }
}
