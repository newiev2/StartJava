package com.startjava.lesson_1.base;

public class UnicodeCycle {
    public static void main(String[] args) {
        //Данная программа выводит символы Юникода в определенном диапазоне [33, 126]
        System.out.println("Данная программа выводит символы Юникода в определенном диапазоне [33, 126]");

        char initSign = 33;

        do {
            System.out.println((int) initSign + " " + initSign);
            initSign++;
        } while(initSign <= 126);
    }
}