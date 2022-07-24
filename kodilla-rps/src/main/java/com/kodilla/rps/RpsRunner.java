package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static int win = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int round= 0;
        boolean end = false;

        System.out.println("Welcome in RPS-Game. Here is the information you need to play the game: \n" +
                "Key 1- play stone \n" + "Key 2- play paper \n" + "Key 3- play scissors \n" +
                "Key x- end of the game \n" + "Key n- new game \n");

        while (!end) {

            round++;
            String player = scan.next();
            String computer = rpsRandom() +"";

            if (player.equals("1") || player.equals("2") || player.equals("3")) {
                System.out.println(game(player,computer));
            }
            if (player.equals("x")) {
                System.out.println("Are you sure you want to quit the game?");
                if( scan.next().equals("x")) {
                    end= true;
                } if (player.equals("n")) {
                    System.out.println("We start the new game!");
                    win = 0;
                    round = 0;
                } else {
                    System.out.println();
                }
                System.out.println("number of games " + round);
                System.out.println("number of win " + win);
            }
        }
    }

    private static int rpsRandom() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public static String game(String player, String computer) {
        if (player.equals("1") && computer.equals("1")) {
            return "The computer selected a stone \n" + "DRAW";
        }
        if (player.equals("1") && computer.equals("2")) {
            return "The computer selected a paper \n" + "The computer wins";
        }
        if (player.equals("1") && computer.equals("3")) {
            win++;
            return "The computer selected a scissors \n" + "The player wins";
        }
        if (player.equals("2") && computer.equals("1")) {
            win++;
            return "The computer selected a stone \n" + "The player wins";
        }
        if (player.equals("2") && computer.equals("2")) {
            return "The computer selected a paper \n" + "DRAW";
        }
        if (player.equals("2") && computer.equals("3")) {
            return "The computer selected a scissors \n" + "The computer wins";
        }
        if (player.equals("3") && computer.equals("1")) {
            return "The computer selected a stone \n" + "The computer wins";
        }
        if (player.equals("3") && computer.equals("2")) {
            win++;
            return "The computer selected a paper \n" + "The player wins";
        }
        if (player.equals("3") && computer.equals("3")) {
            return "The computer selected a scissors \n" + "DRAW";
        }
        return("End of the round");
    }
}
