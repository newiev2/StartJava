package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final Player[] players = new Player[3];
    private int hiddenNumber;

    public GuessNumber(String[] names) {
        for(int i = 0; i < players.length; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void launch() {
        System.out.println("Game has been started. Each player has 10 attempts. Good luck!");
        Scanner input = new Scanner(System.in);
        int round = 0;
        while(round < players.length) {
            round++;
            System.out.println("\nCurrent round: " + round);
            startRound(input);
        }
        printResults();
    }

    private void startRound(Scanner input) {
        castLots();
        hiddenNumber = (int) (Math.random() * 100) + 1;
        while(hasAttempts(players[players.length - 1])) {
            boolean isOut = false;
            for(Player player : players) {
                if(isGuessed(input, player)) {
                    isOut = true;
                    break;
                }
            }
            if(isOut) {
                break;
            }
        }
        printNumbers();
        clearPlayers();
    }

    private void castLots() {
        for(int i = players.length - 1; i > 0; i--) {
            int rnd = (int) (Math.random() * (i + 1));
            Player temp = players[i];
            players[i] = players[rnd];
            players[rnd] = temp;
        }
    }

    private boolean hasAttempts(Player player) {
        return player.getAttempt() != 10;
    }

    private boolean isGuessed(Scanner input, Player player) {
        String name = player.getName();
        System.out.println(name + " your turn. Enter number:");
        player.setNumber(input.nextInt());
        if(player.getNumber() == hiddenNumber) {
            System.out.println("Player " + name + " have guessed secret number " + hiddenNumber
                    + " with " + player.getAttempt() + " attempt");
            player.setScore(player.getScore() + 1);
            return true;
        }
        System.out.println("Number is" + ((player.getNumber() > hiddenNumber) ? " greater " : " less ")
                + "than hidden number");
        if(!hasAttempts(player)) {
            System.out.println(name + " has used all 10 attempts");
        }
        return false;
    }

    private void printNumbers() {
        for(Player player : players) {
            System.out.println("\n" + player.getName() + " numbers:");
            for (int num : player.getNumbers()) {
                System.out.print(num + " ");
            }
        }
    }

    private void clearPlayers() {
        for(Player player : players) {
            player.clear();
        }
    }

    private void printResults() {
        //Checking for 1 winner and 2 losers or 2 winners and 1 loser
        for(int i = 0; i < players.length; i++) {
            boolean isWinner = false;
            for(int j = 0; j < players.length; j++) {
                if(players[i].getScore() > players[j].getScore()) {
                    isWinner = true;
                } else if(players[i].getScore() < players[j].getScore()) {
                    isWinner = false;
                }
            }
            System.out.println("\n" + players[i].getName() + " has " + (isWinner ? "won!" : "lost!"));
        }

        //Checking draw
        if(players[0].getScore() == players[1].getScore() && players[0].getScore() == players[2].getScore()) {
            System.out.println("\n" + "Nobody won! It's draw");
        }
    }
}