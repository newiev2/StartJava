package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Entering player names and writing them to array for game constructor
        String[] names = new String[3];
        for(int i = 0; i < names.length; i++) {
            System.out.println("Player " + (i + 1) + ", enter your name:");
            names[i] = input.nextLine();
        }

        GuessNumber game = new GuessNumber(names);

        String answer;
        do {
            game.launch();
            do {
                System.out.print("\nDo you want to try again? [yes/no]: ");
                answer = input.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}