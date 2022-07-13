package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final Player[] players = new Player[3];
    private int hiddenNumber;

    public GuessNumber(Scanner input) {
        String[] names = new String[3];
        for(int i = 0; i < names.length; i++) {
            System.out.println("Player " + (i + 1) + ", enter your name:");
            names[i] = input.nextLine();
        }
        for(int i = 0; i < players.length; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void launch() {
        System.out.println("Game has been started. Each player has 10 attempts. Good luck!");
        Scanner input = new Scanner(System.in);
        int count = 0;
        while(count != 3) {
            count++;
            System.out.println("\nCurrent round: " + count);
            startRound(input);

        }
        checkWinner();
    }

    private void startRound(Scanner input) {
        castLots();
        hiddenNumber = (int) (Math.random() * 100) + 1;
        while(hasAttempts(players[players.length - 1])) {
            boolean isOut = false;
            for(Player player : players) {
                if(isMatched(input, player)) {
                    isOut = true;
                    break;
                }
            }
            if(isOut) {
                break;
            }
        }
        printNumbers();
        resetPlayers();
    }

    private void castLots() {
        int rnd = (int) (Math.random() * 3);
        for(int i = 0; i < players.length; i++) {
            Player temp = players[i];
            players[i] = players[rnd];
            players[rnd] = temp;
        }
    }

    private boolean hasAttempts(Player player) {
        return player.getAttempt() != 10;
    }

    private boolean isMatched(Scanner input, Player player) {
        if(hasAttempts(player)) {
            System.out.println(player.getName() + " your turn. Enter number:");
            player.setNumber(input.nextInt());
            if(player.getNumber() == hiddenNumber) {
                System.out.println("Player " + player.getName() + " have guessed secret number "
                        + hiddenNumber + " with " + player.getAttempt() + " attempt");
                player.setScore(player.getScore() + 1);
                return true;
            }
            System.out.println((player.getNumber() > hiddenNumber) ?
                    "Number is greater than hidden number" : "Number is less than hidden number");
            if(!hasAttempts(player)) {
                System.out.println("Player " + player.getName() + "have used 10 attempts");
            }
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

    private void resetPlayers() {
        for(Player player : players) {
            player.reset();
        }
    }

    private void checkWinner() {
        // TODO Refactor method, change if-else to smth more optimal
        if(players[0].getScore() > players[1].getScore() || players[0].getScore() > players[2].getScore()) {
            System.out.println(players[0].getName() + "has won!");
        } else if(players[1].getScore() > players[0].getScore() && players[1].getScore() > players[2].getScore()) {
            System.out.println(players[1].getName() + "has won!");
        } else if(players[2].getScore() > players[0].getScore() && players[2].getScore() > players[1].getScore()) {
            System.out.println(players[2].getName() + "has won!");
        } else {
            System.out.println("Draw!");
        }
        if(players[0].getScore() == players[1].getScore()) {
            System.out.println(players[0].getNumber() + " and " + players[1].getName() + " has won! "
                    + players[2] + " has lost");
        } else if(players[0].getScore() == players[2].getScore()) {
            System.out.println(players[0].getNumber() + " and " + players[2].getName() + " has won! "
                    + players[1] + " has lost");
        } else if(players[1].getScore() == players[2].getScore()) {
            System.out.println(players[1].getNumber() + " and " + players[2].getName() + " has won! "
                    + players[0] + " has lost");
        }
    }
}